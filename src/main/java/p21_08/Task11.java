package p21_08;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        //
        //(ZA VEZBANJE)Napisati program prikazuje koliko je svaki od unetih passworda jak.
        // Korisnik unosi N passworda i za svaki se ispisuje jacina.
        //Svaki uslov koji password ispunjava dodaje po 1 poen:
        //duzina veca od 8
        //sadrzi @ specijalan karakter
        //		Primer izvrsenja:
        //		Unesite N: 3
        //		Unesite password: passwdr
        //		Password ima 0 poena.
        //Unesite password: password123
        //		Password ima 1 poena.
        //		Unesite password: password@123
        //		Password ima 2 poena.
        Scanner s = new Scanner(System.in);

        System.out.print("Input N:");
        int n = s.nextInt();

        for (int i = 1;i <=n; i++) {
            System.out.print("Input password: ");
            String password = s.next();

            int counter = password.length();

            if (counter > 8 && password.contains("@")) {
                System.out.println("Password has 2 points");
            } else if (counter > 8 || password.contains("@")) {
                System.out.println("Password has 1 points");
            } else {
                System.out.println("Password has 0 points");
            }
        }
    }
}