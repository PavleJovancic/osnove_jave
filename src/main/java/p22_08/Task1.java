package p22_08;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Napisati program koji validira unos input polja za broj. Polje za unos prima samo brojeve u opsegu od 10 do 50.Korisnik unosi vrednosti dok ne unese validan  broj.
        //Primer izvrsenja:
        //Unesite broj: 5
        //Greska: Broj nije u opsegu od 10 do 50.
        //Unesite broj: -1
        //Greska: Broj nije u opsegu od 10 do 50.
        //Unesite broj: 51
        //Greska: Broj nije u opsegu od 10 do 50.
        //Unesite broj: 4
        //KRAJ

        Scanner s = new Scanner(System.in);

        int number = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Input number: ");
            number = s.nextInt();
            if (number < 10 || number > 50) {
                System.out.println("Error. Number is not between 10 and 50");
            }
            if (number >= 10 && number <= 50) {
                isValid = true;
            }
        }
        System.out.println("Number is between 10 and 50");


    }
}



