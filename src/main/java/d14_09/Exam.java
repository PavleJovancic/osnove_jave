package d14_09;

public class Exam {

        private String subject;
        private int grade;
        private String professor;
    public Exam(String subject, int grade, String professor) {
        this.subject = subject;
        this.grade = grade;
        this.professor = professor;
    }
    public boolean isTheExamPassed(){
        if (this.grade >= 6 && this.grade <= 10){
        return true; } else {
            return false;
        }

    }
    public void printExamInformation(){
        System.out.println(this.subject + " - " + this.professor + " - " + this.grade);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }
}
