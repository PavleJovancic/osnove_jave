package p24_08;


import java.util.ArrayList;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i racuna i stampa sumu svih brojeva niza.
//Primer: Ako je niz 1,2,4,5,7
//Stampa se, suma = 19
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(545);
        numbers.add(1);
        numbers.add(23);
        numbers.add(99);

        int sum = 0;

        for (int i = 0; i < numbers.size(); i++){
            sum = sum + numbers.get(i);
        }
        System.out.println("sum: " + sum);
    }
}
