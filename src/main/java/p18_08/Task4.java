package p18_08;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        //Napisati program koji ispisuje brojeve od 1 do 20
        //Primer izvrsenja:
        //1, 2, 3, 4, 5, 6, 7, …………….20

        Scanner s = new Scanner(System.in);

        for (int i = 1; i <= 20; i++){
            System.out.print(i + ", ");
        }

        System.out.print("END");
    }
}
