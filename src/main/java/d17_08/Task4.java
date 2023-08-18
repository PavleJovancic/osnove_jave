package d17_08;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // Napisati program koji proverava da li je kliknuto u okviru login forme za web stranicu.
        // Korisnik unosi x i y koordinate za T1, T2 i M. Ispisati odgovarajuce poruke.
        //
        //T1 i T2 su pozicije login forme. M je pozicija na koju je kliknuto
        //
        //Primer izvrsenja 1:
        //Unesite x za T1: 10
        //Unesite y za T1: 100
        //Unesite x za T2: 100
        //Unesite y za T2: 0
        //Unestie x za M: 50
        //Unesite y za M: 50
        //Kliknuto je unutar forme
        //
        //Primer izvrsenja 2:
        //Unesite x za T1: 10
        //Unesite y za T1: 100
        //Unesite x za T2: 100
        //Unesite y za T2: 0
        //Unestie x za M: 120
        //Unesite y za M: 50
        //Nije kliknuto je unutar forme
        Scanner s = new Scanner(System.in);

        System.out.print("Input x for T1: ");
        int x1 = s.nextInt();

        System.out.print("Input y for T1: ");
        int y1 = s.nextInt();

        System.out.print("Input x for T2: ");
        int x2 = s.nextInt();

        System.out.print("Input y for T2: ");
        int y2 = s.nextInt();

        System.out.print("Input x for M: ");
        int x3 = s.nextInt();

        System.out.print("Input y for M: ");
        int y3 = s.nextInt();
        if ((x1 < x3 && x3 < x2) && (y1 < y3 && y3 < y2)) {
            System.out.println("Clicked within the form");
        } else {
            System.out.println("Clicked outside the form");
        }
        System.out.print("END");
    }
}
