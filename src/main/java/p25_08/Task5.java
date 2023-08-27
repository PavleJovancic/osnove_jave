package p25_08;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Napisati metodu koja stampa N zvezdica u istom redu, na kraju reda stampa novi red..
        // Broj zvezdica je odredjen parametrom N.
        //Ako se metoda pozove za N=5, metoda stampa 5 zvezdica i enter
        //N=5, print je=> * * * * *
        //
        //Ako se metoda pozove za N = 9, metoda stampa 9 zvezdica i enter
        //N=9, print je=> * * * * * * * * *
//        (DOPUNA)
//          Napisati main program koji koristi kreiranu metodu tako da stampa sledecu sliku za M.
//          M unosi korisnik. Zadatak resiti koristeci petlju u main metodi.
//                Primer izvrsenja:
//        Unesite M: 6
// *
//* *
//* * *
//* * * *
//* * * * *
//* * * * * *
        System.out.println("Input N: ");
        int n = s.nextInt();
            printStars(n);
        System.out.println("Input M: ");
        int m = s.nextInt();
        String nesto = "";
        for (int i = 1; i <=m; i++) {
            printStars(i);
        }
    }
    public static void printStars(int n){
        for (int i = 1; i <=n; i++) {
            System.out.print("* ");
        }
        System.out.println();

    }
}
