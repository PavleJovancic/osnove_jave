package p18_08;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        //Napisati program koji ispisuje SAMO PARNE brojeve od 1 do 100

        Scanner s = new Scanner(System.in);

        for (int i = 1; i <= 100; i++){
            if (i%2 == 0){
            System.out.print(i + ", "); }
        }
        System.out.print("END");

    }
}
