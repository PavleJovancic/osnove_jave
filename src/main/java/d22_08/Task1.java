package d22_08;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Napisati program koji sabira brojeve koje korisnik unosi, pritom da suma ne predje 100.
        //Na kraju programa ispisati sracunatu sumu.
        //Unesite vrednost: 20
        //Unesite vrednost: 50
        //Unesite vrednost: 50
        //Prekoracenje! Kraj programa. Sracunata suma je 70.



        int sum = 0;
        boolean condition = false;
        while (!condition) {
            System.out.print("Input number: ");
            int number = s.nextInt();
            if ((sum + number) < 100) {

                sum = sum + number;
            } else {
                condition = true;
            }
        }
        System.out.println("Exceeding! End of program. The calculated sum is " + sum);


    }
}
