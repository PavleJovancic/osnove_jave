package d07_09;

public class Task1 {
    public static void main(String[] args) {
    //Kreiranje klase "Student
        //Napišite klasu "Student" koja ima sledeće atribute: ime (String), brojIndeksa (int) i fakultet (String).
        // Kreirajte 2-3 objekta ove klase u glavnoj metodi i postavite im vrednosti. Ispisati informacije o studentima.


        Student one = new Student();
        Student two = new Student();
        Student three = new Student();

        one.name = "Nikola Nikolic";
        one.indexNumber = 15333;
        one.University = "Mechanical Engineering University";

        two.name = "Milos Milosevic";
        two.indexNumber = 15344;
        two.University = "Economics University";

        three.name = "Dusan Dusanovic";
        three.indexNumber = 15355;
        three.University = "Art and Science University";

        System.out.println( one.name + ", " + one.indexNumber +  ", " + one.University );
        System.out.println( two.name + ", " + two.indexNumber +  ", " + two.University );
        System.out.println( three.name + ", " + three.indexNumber +  ", " + three.University );
    }
}
