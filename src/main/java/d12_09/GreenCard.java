package d12_09;

public class GreenCard {

    private String name;
    private int index;
    private String subject;
    private String professor;
    private int grade;

    public GreenCard(){}
    public GreenCard(String name, int index, String subject, String professor, int grade){
        this.name = name;
        this.index = index;
        this.subject = subject;
        this.professor = professor;
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public boolean isExamPassed(){
        if (this.grade > 5 && this.grade <= 10){
            return true;
        } else {
            return false;
        }
    }
    public void printGreenCardInfo(){
        System.out.println(this.subject + " - " + this.grade );
        System.out.println("Student: " + this.name);
        System.out.println("Professor: " + this.professor);
        System.out.println("Exam Passed: " + this.isExamPassed());
    }


}
