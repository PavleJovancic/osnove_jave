package d22_08;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Napisati program koji proverava uparenost zagrada.
        // Korisnik unosi matematicku formulu sve dok ne unese znak =.
        // Korisnik unosi svaki karakter jednacine posebno i na kraju programa se ispisuje da li su sve zagrade uparene.
        //	Formula koja se koristi u primeru je: (2 * ( 1 + 3))=
        //	Primer izvrsenja:
        //	Unos: (
        //	Unos: 2
        //	Unos: *
        //	Unos: (
        //	Unos: 1
        //	Unos: +
        //	Unos: 3
        //	Unos: )
        //	Unos: )
        //	Unos: =
        //	Zagrade su uparene
        //	(Objasnjenje: Imamo isti broj otvorenih i zatvorenih zagrada)
        //
        //	Primer izvrsenja 2:
        //	Unos: (
        //	Unos: 2
        //	Unos: *
        //	Unos: (
        //	Unos: 1
        //	Unos: +
        //	Unos: 3
        //	Unos: )
        //	Unos: =
        //	Zagrade nisu uparene
        //	(Objasnjenje: fali poslednja zagrada iz formule)

        String sign = "";
        int leftBracket = 0;
        int rightBracket = 0;
        boolean condition = false;

        while(!condition){
            System.out.print("Input: ");
            sign = s.next();
             if (sign.equals("(")) {
                 leftBracket = ++leftBracket;
             } else if (sign.equals(")")) {
                 rightBracket = ++rightBracket;
             } else if (sign.equals("=")) {
                 condition = true;
             }
        }if (leftBracket == 2 && rightBracket == 2) {
            System.out.println("The brackets are paired");
        } else {
            System.out.println("The brackets are not paired");
        }
    }
}
