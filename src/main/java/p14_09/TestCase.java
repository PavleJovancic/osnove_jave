package p14_09;

import java.util.ArrayList;

public class TestCase {
    private int id;
    private String name;
    private ArrayList<TestStep> testSteps;


    public TestCase(int id, String name){
        this.id = id;
        this.name = name;
        this.testSteps = new ArrayList<>();
    }

    public void addTestSteps(TestStep testStep){
        this.testSteps.add(testStep);
    }
    public int countFailedTestSteps(){
        int counter = 0;
        for (int i = 0; i < testSteps.size(); i++) {
            if (!testSteps.get(i).validate()){
                counter = counter + 1;
            }
        }
        return counter;
    }
    public String testStatus(){
        String testStatus = "";
        if (countFailedTestSteps() == 0){
            testStatus = "PASSED";
        } else {
            testStatus = "FAILED";
        }
        return testStatus;
    }
    public void printTestCase(){
        System.out.println(this.id + " - " + this.name);
        for (int i = 0; i < this.testSteps.size(); i++) {
            this.testSteps.get(i).printTestStep();
        }
        System.out.println(this.testSteps.size() + " / " + this.countFailedTestSteps());
        System.out.println("Test Status: " + this.testStatus());

    }

}
