package d24_08;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Napisati program koji ucitava N brojeva i smesta ih u niz.
        // Zatim, iz niza, broji koliko je parnih brojeva uneto. brojeve unosi korisnik.
        //Unesite N: 5
        //Unesite broj: 1
        //Unesite broj: 3
        //Unesite broj: 4
        //Unesite broj: 7
        //Unesite broj: 8
        //U nizu ima 2 parna broja.
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Input N: ");
        int n = s.nextInt();

        for (int i = 1; i <=5; i++){
            System.out.print("Input number: ");
            int number = s.nextInt();
            numbers.add(number);
        }
        int counter = 0;

        for (int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) % 2 == 0){
                counter = ++counter;
            }
        } System.out.print("There are " + counter + " even numbers.");
    }
}
