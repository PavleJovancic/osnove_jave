package d24_08;

import java.util.ArrayList;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        //Napisati program koji ucitava niz A duzine N i broj X.
        // Nakon unosa treba ispisati indekse onih clanova niza koji su jednaki broju X.
        //	Primer izvrsenja:
        //Unesite N: 5
        //Unesite broj: 1
        //Unesite broj: 3
        //Unesite broj: 7
        //Unesite broj: 3
        //Unesite broj: 9
        //Unesite X: 3
        //
        //Rezultat: Elementi niza A koji su jednaki broju X imaju indekse: 1, 3
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Input N: ");
        int n = s.nextInt();

        for (int i = 1; i <=5; i++){
            System.out.print("Input number: ");
            int number = s.nextInt();
            numbers.add(number);
        }

        String index = "";

        System.out.print("Input X: ");
        int x = s.nextInt();

        for (int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) == x){
                index= index + ", " + i;
            }
        } System.out.print("Elements that are equal to X have index: " + index);
    }
}
