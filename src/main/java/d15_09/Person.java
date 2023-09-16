package d15_09;

public class Person {

    protected String name;
    protected String jmbg;
    protected int yearOfBirth;

    public Person() {
    }

    public Person(String name, String jmbg, int yearOfBirth) {
        this.name = name;
        this.jmbg = jmbg;
        this.yearOfBirth = yearOfBirth;
    }
    public void printInfo(){
        System.out.println(this.name + ", " + this.jmbg + ", " + this.yearOfBirth);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
