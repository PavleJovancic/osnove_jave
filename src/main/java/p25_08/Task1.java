package p25_08;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        //Napisati metodu koja stampa ime i prezime i u glavnom programu pozvati metodu na izvrsenje 5 puta.
        //
        //
        for (int i = 1; i <= 5; i++) {
            printFullName();
        }
    }
    public static void printFullName(){
        System.out.println("Pera Peric");
    }
}
