package p17_08;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
//        Napisati program koji ucitava brojeve a, b i c sa tastature i proverava da li je broj a u opsegu od b do c.
//Primer izvrsenja:
//Unesite b: 5
//Uneiste c: 50
//Unesite a: 15
//A je u opstegu izmedju 5 i 50

        Scanner s = new Scanner(System.in);

        System.out.print("Input b:");
        int b = s.nextInt();

        System.out.print("Input c:");
        int c = s.nextInt();

        System.out.print("Input a:");
        int a = s.nextInt();

        if ((b < a && a < c) || (c < a && a < b)){
            System.out.println("a is between b and c");
        }
        System.out.println("END");
    }
}
