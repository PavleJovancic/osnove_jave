package p21_08;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
      //Napisati program koji od brojeva od 1 do 10 formira string koji ima spoj svih brojeva.
        //Primer izvrsenja:
        //String je 12345678910
        Scanner s =new Scanner(System.in);

        String sum = "";

        for (int i = 1; i <=10; i++) {
            sum = sum + i;
        }
        System.out.print("String is " + sum);

    }
}
