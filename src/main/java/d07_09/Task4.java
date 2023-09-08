package d07_09;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
// Kreiranje klase "Film"
//Napišite klasu "Film" sa atributima: naslov (String), godinaIzdanja (int) i reziser (String).
// U glavnoj metodi kreirajte 2-3 objekta ove klase i postavite im vrednosti unosom sa tastature. Ispisati informacije o filmovima.

        Scanner s = new Scanner(System.in);

        Film one = new Film();
        Film two = new Film();
        Film three = new Film();

        System.out.print("Enter title for the first movie:");
        one.title = s.next();
        System.out.print("Enter director for the first movie:");
        one.director = s.next();
        System.out.print("Enter year for the first movie:");
        one.year = s.nextInt();

        System.out.print("Enter title for the second movie:");
        two.title = s.next();
        System.out.print("Enter director for the second movie:");
        two.director = s.next();
        System.out.print("Enter year for the second movie:");
        two.year = s.nextInt();

        System.out.print("Enter title for the third movie:");
        three.title = s.next();
        System.out.print("Enter director for the third movie:");
        three.director = s.next();
        System.out.print("Enter year for the third movie:");
        three.year = s.nextInt();

        System.out.println( one.title + ", " + one.director +  ", " + one.year );
        System.out.println( two.title + ", " + two.director +  ", " + two.year );
        System.out.println( three.title + ", " + three.director +  ", " + three.year );



    }
}
