package d17_08;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        //. (Za vezbanje)Napisati program koji ucitava 4 broja (a,b,c,d) i formira string p (p ima startni deo #) tako sto negativne brojeve lepi sa leve strane a pozitivne i nulu sa desne.
        //Hint: Potrebno je da se vrsi konkatanacija nad jednom promenljivom.
        //Primer izvrsenja 1:
        //Unesite a: 10  -> # 10
        //Unesite b: -2   -> -2 # 10
        //Unesite c: -1   -> -1 -2 # 10
        //Unesite d: 9    -> -1 -2 # 10 9
        //String p ime vrednost = -1 -2 # 10 9
        //
        //
        //
        //
        //Primer izvrsenja 2:
        //Unesite a: 5
        //Unesite b: 4
        //Unesite c: 41
        //Unesite d: -1
        //String p ime vrednost = -1 # 5 4 41
        //
        //Primer izvrsenja 3:
        //Unesite a: 11
        //Unesite b: 2
        //Unesite c: 7
        //Unesite d: 15
        //String p ime vrednost = # 11 2 7 15
        //
        //
        //
        //
        //Primer izvrsenja 4:
        //Unesite a: -11
        //Unesite b: -2
        //Unesite c: -7
        //Unesite d: 15
        //String p ime vrednost = -7 -2 -11 # 15
        Scanner s = new Scanner(System.in);

        String p = "#";

        System.out.print("Input a: ");
        int a = s.nextInt();

        if(a<0) {
            p = a + " " + p;
        } else {
             p = p + " " + a;
        }
        System.out.print("Input b: ");
        int b = s.nextInt();

        if (b<0) {
             p = b + " " + p;
        } else {
             p = p + " " + b;
        }

        System.out.print("Input c: ");
        int c = s.nextInt();

        if (c<0) {
             p = c + " " + p;
        } else {
             p = p + " " + c;
        }

        System.out.print("Input d: ");
        int d = s.nextInt();

        if (d<0) {
             p = d + " " + p;
        } else {
             p = p + " " + d;
        }

        System.out.print("String p has value: " + p);
    }
}
