package d07_09;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
// Kreiranje klase "Oprema"
//Napišite klasu "Oprema" sa atributima: tip (String), marka (String) i cena (double).
// U glavnoj metodi kreirajte 3 objekta ove klase i postavite im vrednosti unosom sa tasture. Ispisati informacije o opremi.

        Scanner s = new Scanner(System.in);

        Equipment one = new Equipment();
        Equipment two = new Equipment();
        Equipment three = new Equipment();

        System.out.print("Enter type:");
        one.type = s.next();
        System.out.print("Enter brand:");
        one.brand = s.next();
        System.out.print("Enter price:");
        one.price = s.nextDouble();

        System.out.print("Enter type:");
        two.type = s.next();
        System.out.print("Enter brand:");
        two.brand = s.next();
        System.out.print("Enter price:");
        two.price = s.nextDouble();

        System.out.print("Enter type:");
        three.type = s.next();
        System.out.print("Enter brand:");
        three.brand = s.next();
        System.out.print("Enter price:");
        three.price = s.nextDouble();

        System.out.println( one.type + ", " + one.brand +  ", " + one.price );
        System.out.println( two.type + ", " + two.brand +  ", " + two.price );
        System.out.println( three.type + ", " + three.brand +  ", " + three.price );



    }
}
