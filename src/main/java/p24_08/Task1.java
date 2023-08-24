package p24_08;


import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i prikazuje sumu nultog i zadnjeg elementa tog niza.

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(545);
        numbers.add(1);
        numbers.add(23);
        numbers.add(99);

        int x = numbers.size();
        int sum = numbers.get(0) + numbers.get(x - 1);
        System.out.println(sum);

    }
}
