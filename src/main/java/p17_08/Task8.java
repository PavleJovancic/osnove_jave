package p17_08;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
  //Zadatak
        //Napisati program koji ucitava stranice trougla a, b i c i ispisuje da li je trougao pravougli.
        // Trougao je pravougli ako je
        //
        //Primer izvrsenja 1:
        //Unesite a: 3
        //Unesite b: 4
        //Unesite c: 5
        //Trougao je pravougli
        //
        //Primer izvrsenja 2:
        //Unesite a: 3
        //Unesite b: 4
        //Unesite c: 6
        //Trougao nije pravougli

        Scanner s = new Scanner(System.in);

        System.out.println("Input a:");
        int a = s.nextInt();

        System.out.println("Input b:");
        int b = s.nextInt();

        System.out.println("Input c:");
        int c = s.nextInt();

        if (a*a + b*b == c*c) {
            System.out.println("The triangle is right angled");
        } else {
            System.out.println("The triangle not is right angled");
        }
        System.out.println("END");
    }
}
