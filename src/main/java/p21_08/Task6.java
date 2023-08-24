package p21_08;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
      //Napisati program koji od korisnika ucitava N jednocifrenih brojeva i od njih formira rezultujuci broj kao na primeru
        //Unesite N: 5
        //Unesite broj: 1 => 1
        //Unesite broj: 2 => 12
        //Unesite broj: 0 => 120
        //Unesite broj: 4 …
        //Unesite broj: 1
        //Rezultujuci broj je 12041 (Promenljiva tipa int)
        //
        //a = 1
        //b = 3
        //c = a * 10 + b => 10 + 3 => 13
        Scanner s =new Scanner(System.in);

        System.out.println("Input N:");
        int n = s.nextInt();
        int result = 0;

        for (int i = 1; i <= n; i ++){
            System.out.print("Input number: " );
            int number = s.nextInt();
            result = result * 10 + number;
        }
        System.out.println("Result is " + result);
    }

}
