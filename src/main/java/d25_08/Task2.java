package d25_08;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije vraca novu vrednost koja se formira kao na primeru.
        //METODA NISTA NE STAMPA.
        //ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
        //ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.

        Scanner s = new Scanner(System.in);

        System.out.print("Input first number: ");
        int a = s.nextInt();
        System.out.print("Input second number: ");
        int b = s.nextInt();

        String concatenatedNumber = concatenateTwoNumber(a,b);
        System.out.println("New number is " + concatenatedNumber);

    }
    public static String concatenateTwoNumber (int a , int b){
        String concatenatedNumber = a + "" + b;
        return concatenatedNumber;
    }
}
