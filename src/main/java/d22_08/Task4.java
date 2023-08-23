package d22_08;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Napisati program koji od korisnika ucitava brojeve sve dok ne unesu bar dve dvojke ili tri jedinice.
        //Primer izvrsenja 1:
        //Unesite broj:1
        //Unesite broj:2
        //Unesite broj:0
        //Unesite broj:2
        //Kraj programa.
        //(Objasnjenje: Kraj jer je uneto dve dvojke)
        //
        //Primer izvrsenja 1:
        //Unesite broj:1
        //Unesite broj:2
        //Unesite broj:1
        //Unesite broj:3
        //Unesite broj:1
        //Kraj programa.
        //(Objasnjenje: Kraj jer je uneto tri jedinice)

        int countTwo = 0;
        int countThree = 0;

        while (countTwo < 2 || countThree < 3) {
            System.out.print("Input number: ");
            int number = s.nextInt();
            if (number == 2) {
                countTwo = countTwo + 1;
            } else if (number == 3) {
                countThree = countThree + 1;
            }
        }
        System.out.print("Program END");
    }
}
