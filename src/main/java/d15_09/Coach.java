package d15_09;

public class Coach extends Person{
    //Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
    //godine iskustva
    //tip trenera (kondicioni, za igru, pomocni, personalni)
    //metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
    //
    private int experience;
    private String type;

    public Coach(String name, String jmbg, int yearOfBirth, int experience, String type) {
        super(name, jmbg, yearOfBirth);
        this.experience = experience;
        this.type = type;
    }
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Years of experience: " + this.experience + " years");
        System.out.println("Type of coach: " + this.type);
        System.out.println();

    }
}
