package p25_08;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
            //Napisati dve metode, jedna metoda sluzi za stampanje imena a druga sluzi za stampanje prezimena.
        // U glavnom programu pozvati metode na izvrsenje tako da se 5 puta ispise ime i prezime u istom redu.
        //        //Primer izvrsenja:
        //        //Milan Jovanovic
        //        //Milan Jovanovic
        //        //Milan Jovanovic
        //        //Milan Jovanovic
        //        //Milan Jovanovic

        for (int i = 1; i <=5; i++) {
            printFirstName();
            printLastName();
            System.out.println();
        }


    }
    public static void printFirstName(){
        System.out.print("Pera ");
    }
    public static void printLastName(){
        System.out.println("Peric");
    }

}
