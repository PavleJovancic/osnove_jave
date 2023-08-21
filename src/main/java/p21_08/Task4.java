package p21_08;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
      //Napisati program koji pronalazi 7 stepen broja 2. Koristeci FOR petlju
        //Izvrsenje:
        //            2 na stepen 7 je 128
        //
        //Podsetnik: 2 na 7 moze da se predstavi kao  2 * 2 * 2 * 2 * 2 * 2 * 2
        Scanner s =new Scanner(System.in);

        int squared = 2;

        for (int i = 1; i < 7; i++){
            squared = squared * 2;
        }
        System.out.println(squared);
    }
}
