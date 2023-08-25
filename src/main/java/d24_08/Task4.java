package d24_08;

import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        //Napisati program koji ucitava niz A duzine N, i koji nakon unosa niz A stampa sve elemente niza koji su veci od nule.
        //Primer izvrsenja:
        //Unesite N: 5
        //Unesite broj: 1
        //Unesite broj: -4
        //Unesite broj: 3
        //Unesite broj: -7
        //Unesite broj: 9
        //Brojevi veci od nule u nizu A su: 1, 3, 9,

                Scanner s = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Input N: ");
        int n = s.nextInt();

        for (int i = 1; i <=5; i++){
            System.out.print("Input number: ");
            int number = s.nextInt();
            numbers.add(number);
        }

        String positiveNumbers = "";

        for (int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) > 0){
                positiveNumbers = positiveNumbers + ", " + numbers.get(i);
            }
        } System.out.print("Numbers greater than zero are: " + positiveNumbers);
    }
}
