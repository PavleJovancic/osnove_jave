package p18_08;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //Napisati program koji ispisuje za uneti broj a da li je deljiv sa 2 ili sa 3.
        // Ispisati poruke na kraju programa u obe situacije.
        //
        //Upoznajte se sa opertorom moduo % dok ne dodjemo do tog operatora.
        //
        //HINT: Broj B je deljiv brojem A ukoliko je ostatak pri deljenju sa A jedan nuli

        Scanner s = new Scanner(System.in);
        System.out.println("Input number a: ");
        int a = s.nextInt();

        if (a % 2 == 0) {
            System.out.println("Number a can be divided 2");
        } else if  (a % 3 == 0) {
            System.out.println("Number a can be divided by 3");
        } else { System.out.println("Invalid number");

        }




        System.out.print("END");
    }
}
