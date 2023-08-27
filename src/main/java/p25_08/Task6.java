package p25_08;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Napisati metodu koja vraca suprotno negativni broj od prosledjenog.
        // Metoda prima broj N i vraca ga sa negativnom vrednoscu.
        //Primer: Ako se metoda pozove za N=10, vraca -10
        //	Ako se metoda pozove za N=-11, vraca 11

        System.out.println("Input N: ");
        int n = s.nextInt();
        int x = turnNumberToNegative(n);

        System.out.println("N = " + n + ", X = " + x);

    }
    public static int turnNumberToNegative(int n){
        int x = n * -1;
        return x;

    }
}
