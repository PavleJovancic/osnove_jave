package PracticeTest;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
//Napisati program koji validira unos lozinke sve dok korisnik ne unese validnu.
//Lozinka je validna ukoliko ima minimum 8 karaktera i sadrzi bar jedan od dva
//specijalna karaktera a specijalni karakteri su @ i #
//Primer izvrsenja:
//Unesite lozinku: ITBootcamp
//Lozinka nije validna.
//Unesite lozinku: ITBootcamp12
//Lozinka nije validna.
//Unesite lozinku: ITBoo@
//Lozinka nije validna.
//Unesite lozinku: ITBootcamp@
//Lozinka je validna.

        Scanner s = new Scanner(System.in);

        boolean condition = false;
        String password = "";
        while (!condition) {
            System.out.println("Enter password: ");
            password = s.next();
            if (password.length() >= 8 && (password.contains("@") || password.contains("#"))){
                condition = true;
                System.out.println("Password is valid");
            } else {
                System.out.println("Password is invalid");
            }
        }
    }
}
