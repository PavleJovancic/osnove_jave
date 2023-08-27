package p25_08;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Napisati metodu koja stampa zvezdicu sa razmakom.
        // U glavnom programu je potrebno odstampati sledecu sliku koristeci metode koje smo definisali.
        // *  *  *
        // *  *
        // *
        star();
        star();
        star();
        System.out.println();
        star();
        star();
        System.out.println();
        star();

    }
    public static void star(){
        System.out.print("* ");
    }
}
