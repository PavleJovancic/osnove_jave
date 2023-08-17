package p17_08;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        //Napisati program koji sa tastature ucitava tri broja a, b i c i ispisuje srednju vrednost za ta tri broja.
        // Sve promenljive u programu su po tipu double

        Scanner s = new Scanner(System.in);

        System.out.print("Input number a: ");
        double a = s.nextDouble();

        System.out.print("Input number b: ");
        double b = s.nextDouble();

        System.out.print("Input number c: ");
        double c = s.nextDouble();

        double avg = (a + b + c) / 3;

        System.out.println("Avg: " + avg);

    }
}
