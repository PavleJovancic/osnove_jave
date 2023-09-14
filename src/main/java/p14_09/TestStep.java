package p14_09;

public class TestStep {
    private String description;
    private String expectedResult;
    private String actualResult;
    private String errorMessage;

    public TestStep(String description, String expectedResult, String actualResult, String errorMessage) {
        this.description = description;
        this.expectedResult = expectedResult;
        this.actualResult = actualResult;
        this.errorMessage = errorMessage;
    }

    public boolean validate() {

        if (this.expectedResult.equals(this.actualResult)) {
            return true;
        } else {
            return false;
        }
    }

    public void printTestStep() {
        System.out.println("| " + this.description + " |");
        System.out.print("| Status: ");
        if (this.validate()){
            System.out.print("Passed");
        } else {
            System.out.print("Failed");
        }
        System.out.println(" |");
        if (!this.validate()) {
            System.out.println(" | " + this.errorMessage);
        }
    }





    public String getDescription() {
        return description;
    }

    public String getExpectedResult() {
        return expectedResult;
    }

    public String getActualResult() {
        return actualResult;
    }

    public String getErrorMessage() {
        return errorMessage;
    }


}
