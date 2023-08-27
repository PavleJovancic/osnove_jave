package d25_08;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.
        // Iz main-a pozvati izvrsenje metode za razlicite vrednosti.
        Scanner s = new Scanner(System.in);

        System.out.print("Input number: ");
        int number = s.nextInt();

        printValueGreaterBy10(number);

    }
    public static void printValueGreaterBy10 (int x){
        int greaterNumber = x + 10;
        System.out.println("Number " + greaterNumber + " is greater than " + x + " by 10.");

    }
}
