package d18_08;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        //(Za vezbanje) Napisati program koji ucitava dimenziju table i stampa je na ekranu.
        //Primer izvrsenja:
        //Unesite dimenziju table: 5
        // _|_|_|_|_|
        // _|_|_|_|_|
        // _|_|_|_|_|
        // _|_|_|_|_|
        // _|_|_|_|_|
        //
        //Primver izvrsenja 2:
        //Unesite dimenziju table: 7
        // _|_|_|_|_|_|_|
        // _|_|_|_|_|_|_|
        // _|_|_|_|_|_|_|
        // _|_|_|_|_|_|_|
        // _|_|_|_|_|_|_|
        // _|_|_|_|_|_|_|
        // _|_|_|_|_|_|_|

        Scanner s = new Scanner(System.in);

        System.out.print("Input table dimension: ");
        int dimension = s.nextInt();
        int table = dimension * dimension;

        for (int i = 1; i <= table; i++) {
            if (i % dimension == 0){
                System.out.println("_|");
            } else {
            System.out.print("_|");
            }
        }



    }
}
