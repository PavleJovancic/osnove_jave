package p21_08;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
      // Napisati program koji za sve petocifene brojeve radi mirror opciju.
        //Primer izvrsenja:
        //Unesite broj: 32492
        //Novi broj je 29423
        Scanner s =new Scanner(System.in);

        System.out.print("Input number: " );
        int number = s.nextInt();
        int result = 0;

        for (int i = 1; i <= 5; i ++){
            result = number % 10;
            System.out.print(result);
            number = number / 10;
        }
    }
}
