package p22_08;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Napisati program koji od korisnika ucitava brojeve sve dok ne unesu dve nule.
        //Primer:
        //Unesite broj:1
        //Unesite broj:2
        //Unesite broj:0
        //Unesite broj:1
        //Unesite broj:0
        //Kraj programa jer je uneto 2 nule.

        Scanner s = new Scanner(System.in);

        int number = 0;
        boolean isValid = false;
        int counter = 0;

        while (!isValid) {
            System.out.print("Input number: ");
            number = s.nextInt();

            if (number == 0) {
                counter = counter + 1;
            }
            if (counter == 2) {
                isValid = true;
            }
        }
        System.out.println("END");
        // while (counter<2) {
        // System.out.print("Input number: ");
        // number = s.nextInt();
        //   if (number == 0) {
        //    counter = counter++;
        //   }


    }
}



