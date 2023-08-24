package p22_08;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        //Napisati program koji radi bipovanje ruznih reci.
        // Program radi za jednu recenicu, sto znaci da ucitava od korisnika rec po rec sve dok se ne unese rec sa tackom.
        // Za reci koje su nepristojne ispisuje beeeeeeeeeeeeep.
        //Ruzne reci koje program prepoznaje su:
        //zajebava
        //mars
        //stoko
        //svinjo
        //Unesite rec: Jel
        //Jel
        //Unesite rec:ti
        //ti
        //Unesite rec:to
        //to
        //Unesite rec:mene
        //mene
        //Unesite rec:zajebavas
        //beeeeeeeeeep
        //Unesite rec:stoko
        //beeeeeeeeeep
        //Unesite rec:jedna.
        //jedna.
        //Kraj programa.
        Scanner s = new Scanner(System.in);

        boolean condition = false;

        while (!condition) {
            System.out.print("Input word: ");
            String word = s.next();
            if (word.contains("zajebava") || word.contains("stok") || word.contains("svinj") || word.contains("mars")){
                System.out.println("beeeeeeeeep");
            } else {
                System.out.println(word);
            }
            if (word.contains(".")){
                condition = true;
            }
        }
        System.out.println("END");


    }
}



