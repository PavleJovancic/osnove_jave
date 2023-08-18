package p18_08;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Napisati program koji ucitava broj a i ispisuje poruke:
        //Ukoliko je broj a do 10 stampamo da je jednocifren broj
        //Ukoliko je broj a do 100 stampamo da je dvocifren broj
        //Ukoliko je broj a veci od 100 stampamo da je trocifren.

        Scanner s = new Scanner(System.in);

        System.out.print("Input a: ");
        int a = s.nextInt();

        if (a < 10) {
            System.out.println("Number a is single digit number");
        } else if (a < 100) {
            System.out.println("Number a is double digit number");
        } else if (a < 1000) {System.out.println("Number a is three digit number");
        } else { System.out.println("Invalid number");}


        System.out.print("END");
    }
}
