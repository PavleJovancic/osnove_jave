package p24_08;


import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i koji zamenjuje vrednosti prvog (na poziciji nula) i zadnjeg elemnta niza.
//Objasnjenje: Ako je niz 2,4,5,6,7 nakon izmene treba da bude 7,4,5,6,2
//Napomena: U zadataku nakon kreiraanja niza, ne treba se desi kod koji setuje fiksne vrednosti u niz.
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(545);
        numbers.add(1);
        numbers.add(23);
        numbers.add(99);

        int lastNumberPlace = numbers.size() - 1;
        int lastNumber = numbers.get(lastNumberPlace);
        int firstNumber = numbers.get(0);

        numbers.set(0, lastNumber);
        numbers.set(lastNumberPlace, firstNumber);
    }
}
