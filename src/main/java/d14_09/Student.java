package d14_09;

import java.util.ArrayList;

public class Student {


    private int index;
    private String name;
    private String studies;
    private ArrayList<Exam> exams;

    public Student(int index, String name, String studies) {
        this.index = index;
        this.name = name;
        this.studies = studies;
        this.exams = new ArrayList<>();
    }
    public void addExam(Exam exam){
        this.exams.add(exam);
    }
    public double calculateGPA(){
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < this.exams.size(); i++) {
            if(this.exams.get(i).isTheExamPassed()){
                sum = sum + this.exams.get(i).getGrade();
                counter = ++counter;
            }
        }
        double gpa = 1.0 * sum / counter;
        return gpa;
    }
    public void printStudentInformation(){
        System.out.println(this.index + " - " + this.name + " - " + this.studies);
        System.out.println("Exams: ");
        for (int i = 0; i < this.exams.size(); i++) {
            this.exams.get(i).printExamInformation();
        }
        System.out.println("GPA: " + this.calculateGPA());
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudies() {
        return studies;
    }

    public void setStudies(String studies) {
        this.studies = studies;
    }

    public ArrayList<Exam> getExams() {
        return exams;
    }
}
