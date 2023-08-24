package p21_08;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
      // Napisati program koji za sve petocifrene brojeve izvlaci sve cifre i stampa ih na ekranu.
        //Primer izvrsenja:
        //Unesite broj: 19452
        //2, 5, 4, 9, 1
        Scanner s =new Scanner(System.in);

        System.out.print("Input number: " );
        int number = s.nextInt();
        int result = 0;

        for (int i = 1; i <= 5; i ++){
            result = number % 10;
            System.out.print(result + ", ");
            number = number / 10;
        }
    }

}
