package p17_08;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        //Napisati program koji ucitava brojeve a, b i c sa tastature i za svaki broj proverava da li je validan.
        // Ukoliko je broj nije validan, ispisuje se greska za svaki broj.
        //Broj nije validan ukoliko je broj negativan.
        //Primer izvrsenja 1:
        //Unesite a: 10
        //Unesite b: -22
        //Unesite c: -4
        //Unet broj B=-22 nije validan
        //Unet broj C=-4 nije validan
        //
        //Primer izvrsenja 2:
        //Unesite a: -10
        //Unesite b: -22
        //Unesite c: 4
        //Unet broj A=-10 nije validan
        //Unet broj C=-4 nije validan

        Scanner s = new Scanner(System.in);

        System.out.print("Input A:");
        int a = s.nextInt();

        System.out.print("Input B:");
        int b = s.nextInt();

        System.out.print("Input C:");
        int c = s.nextInt();

        if (a < 0) {
            System.out.println("Number A=" + a + " is not valid");
        }
        if (b < 0) {
            System.out.println("Number B=" + b + " is not valid");
        }
        if (c < 0) {
            System.out.println("Number C=" + c + " is not valid");
        }
        System.out.println("END");
    }
}
