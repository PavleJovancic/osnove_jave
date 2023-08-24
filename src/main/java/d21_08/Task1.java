package d21_08;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Napisati program koji od korisnika ucitava N brojeva i sabira samo parne brojeve.
        // Na kraju programa prikazati sumu.
        //Primer izvrsenja:
        //Unesite N: 5
        //Unesite broj: 1
        //Unesite broj: 2
        //Unesite broj: 9
        //Unesite broj: 6
        //Unesite broj: 8
        //Suma parnih brojeva je 16
        //Objasnjenje: 2 + 6 + 8 = 16

        Scanner s = new Scanner(System.in);
        System.out.print("Input N: ");
        int n = s.nextInt();
        int sum = 0;
        for (int i = 1; i <=n; i++ ){
            System.out.print("Input number: ");
            int number = s.nextInt();
            if (number % 2== 0 ){
                sum =number + sum;
            }
        }
        System.out.print("Sum of even number is " + sum);





    }
}
