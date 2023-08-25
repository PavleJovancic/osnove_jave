package d24_08;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Napisati program koji u sebi ima definisan niz od 10 broja (brojevi su proizvoljni) i koji menja vrednost elementa na pozciji K.
        // K i novu vrednost unosi korisnik.
        //Primer:
        //Unesite pozicjiu od 0 do 9: 3
        //Unesite novu vrednost: 11
        //Element na 3. poziciji treba na kraju da ima vrednost 11 u vasem programu
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(545);
        numbers.add(1);
        numbers.add(23);
        numbers.add(99);
        numbers.add(11);
        numbers.add(145);
        numbers.add(71);
        numbers.add(33);
        numbers.add(999);

        System.out.println("Input position: ");
        int position = s.nextInt();
        System.out.println("Input number: ");
        int number = s.nextInt();

        numbers.set(position, number);
    }
}
