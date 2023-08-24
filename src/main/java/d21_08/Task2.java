package d21_08;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Napisati program koji ucitava N brojeva od korisnika i sabira samo trocifrene brojeve.
        //Unesite N: 5
        //Unesite broj: 1
        //Unesite broj: 32
        //Unesite broj: 121
        //Unesite broj: 1333
        //Unesite broj: 144
        //Suma je: 265

        Scanner s = new Scanner(System.in);
        System.out.print("Input N: ");
        int n = s.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++){
            System.out.println("Input number: ");
            int number = s.nextInt();
            if (number >= 100 && number < 1000){
                sum = sum + number;
            }
        }
        System.out.print("Sum: " + sum);

    }
}
