package p24_08;


import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i menja vrednost elementa na poziciji 3 tako sto je povecava 10 puta.
//Npr: 1,4,5,6,7 => 1,4,5,60,8
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(545);
        numbers.add(1);
        numbers.add(23);
        numbers.add(99);

        int newNumber = numbers.get(3) * 10;
        numbers.set(3, newNumber);
    }
}
