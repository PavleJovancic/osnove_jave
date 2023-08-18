package d17_08;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Napisati program koji za ucitava brojeve a i b (b ima vrednosti 1 ili 2) Ukoliko se za b unese:
        //b=1, vrednost promenljive a se uvecava za 10
        //b=2, vrednost promenljive a se smanjuje za 20
        //Na kraju zadatka odstampati novu vrednost promenljive a.
        //	Primer izvrsenja:
        //	Unesite a: 44
        //	Unesite b: 2
        //	Nova vrednost za a je 24

        Scanner s = new Scanner(System.in);

        System.out.print("Input a: ");
        int a = s.nextInt();

        System.out.print("Input b: ");
        int b = s.nextInt();

        if (b == 1) {
            System.out.println("New value for a is " + (a + 10));
        }
        if (b == 2){
            System.out.println("New value for a is " + (a - 20));
        }
        if (b < 1 || b > 2) {
            System.out.println("Invalid b value");
        }
        System.out.print("END");
    }
}
