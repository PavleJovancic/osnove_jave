package p21_08;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
      //Napisati program koji od korisnika ucitava N brojeva  i ispisuje sumu tih brojeva. N nam kaze koliko broja ce korisnik da unese.
        //Primer izvrsenja:
        //Unesite N: 3
        //Unesite broj: 1
        //Unesite broj: 4
        //Unesite broj: 9
        //Suma je 14.
        Scanner s =new Scanner(System.in);

        System.out.println("Input N:");
        int n = s.nextInt();
        int sum = 0;


        for (int i = 1; i <= n; i ++){
            System.out.print("Input number: " );
             int number = s.nextInt();
            sum = sum + number;

        }
        System.out.println(sum);



    }

}
