package p24_08;


import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i koji prikazuje element na poziciji K.
// K unosi korisnik i smatrajte da unosi u opsegu od 0 do 4.
//Primer:
//Unesite pozicjiu: 2
//Na pozicji 2 je vrednost 7.

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(545);
        numbers.add(1);
        numbers.add(23);
        numbers.add(99);

        System.out.print("Input position: ");
        int position = s.nextInt();

        int number = numbers.get(position);

        System.out.print("At position " + position + " value is " + number);

    }
}
