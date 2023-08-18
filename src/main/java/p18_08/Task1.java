package p18_08;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

    //Napisati program koji sa tastature ucitava broj N i operaciju koja se izvrsava nad njim. Na kraju programa se ispisuje nova vrednost promenljive N.
        //Ukoliko se za operaciju unese uvecaj, to uvecava promenljivu N za 1.
        //Ukoliko se za operaciju unese smanji, to smanjuje promenljivu N za 1.
        Scanner s = new Scanner(System.in);

        System.out.print("Input N: ");
        int n = s.nextInt();

        System.out.print("Input operation: ");
        String operation = s.next();

        if (operation.equals("increase")){
            n = n + 1;
        }
        if (operation.equals("decrease")){
            n = n - 1;
        }
        System.out.print("New value N: " + n);
    }
}
