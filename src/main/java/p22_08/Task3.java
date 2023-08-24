package p22_08;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //Napisati program koji od korisnika ucitava brojeve sve dok ne unesu makar po jedan broj od 1 do 4.
        //Primer:
        //Unesite broj:1
        //Unesite broj:2
        //Unesite broj:2
        //Unesite broj:3
        //Unesite broj:0
        //Unesite broj:5
        //Unesite broj:3
        //Unesite broj:4
        //Kraj programa
        //
        //Objasnjenje: Od svakih 1, 2, 3 i 4 je unet po jedan.

        Scanner s = new Scanner(System.in);

        int number = 0;
        boolean isValid = false;
        boolean one = false;
        boolean two = false;
        boolean three = false;
        boolean four = false;

        while (!isValid) {
            System.out.print("Input number: ");
            number = s.nextInt();

            if (number == 1) {
                one = true;
            }
            if (number == 2) {
                two = true;
            }
            if (number == 3) {
                three = true;
            }
            if (number == 4) {
                four = true;
            }
            if (one == true && two == true && three == true && four == true) {
                isValid = true;
            }
        }
        System.out.println("END");


    }
}



