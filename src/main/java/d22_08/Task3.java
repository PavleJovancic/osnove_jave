package d22_08;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Napisati program koji ucitava RIMSKE brojeva od korisnika i na ekranu ispisuje arapsku vrednost sve dok korisnik ne unese KRAJ..
        //
        //Primer izvrsenja:
        //Unesite rimski broj: X
        //Arapski: 10
        //Unesite rimski broj: C
        //Arapski: 50
        //Unesite rimski broj: D
        //Arapski: 500
        //Unesite rimski broj: M
        //Arapski: 1000
        //Unesite rimski broj: I
        //Arapski: 1
        //Unesite rimski broj: KRAJ
        //Kraj programa.

        String roman = "";
        boolean condition = false;

        while (!condition){
            System.out.print("Input roman numeral: ");
            roman = s.next();
            if (roman.equals("I")){
                System.out.println("Arabian: 1" );
            } else if (roman.equals("V")){
                System.out.println("Arabian: 5" );
            } else if (roman.equals("X")){
                System.out.println("Arabian: 10" );
            } else if (roman.equals("C")){
                System.out.println("Arabian: 50" );
            } else if (roman.equals("C")){
                System.out.println("Arabian: 100" );
            } else if (roman.equals("D")){
                System.out.println("Arabian: 500" );
            }else if (roman.equals("M")) {
                System.out.println("Arabian: 1000");
            } else if (roman.equals("KRAJ")){
                condition = true;
            }
        }
        System.out.print("Program END");
    }
}
