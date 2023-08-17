package p17_08;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
    //Napisati program koji proverava da li je broj telefona validan.
        // Program na pocetku ucitava broj telefona korisnika i ispisuje gresku ukoliko telefon nije validan.
        //Broj nije validan ukoliko nema +381 ili ako ima kosu crtu (/)

        Scanner s = new Scanner(System.in);

        System.out.println("Enter phone number: ");
        String phoneNumber = s.next();

        if (!phoneNumber.contains("+381") || phoneNumber.contains("/")){
            System.out.println("Phone number is invalid");
        }
        System.out.println("END");




    }
}
