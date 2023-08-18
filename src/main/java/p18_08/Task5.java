package p18_08;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        //Napisati program koji ispisuje brojeve od -10 do 10.
        //Primer izvrsenja:
        //-10, -9, -8, ……0, 1, 2, ………10

        Scanner s = new Scanner(System.in);

        for (int i = -10; i <= 10; i++) {
            System.out.print(i + ", ");
        }

        System.out.print("END");

    }
}
