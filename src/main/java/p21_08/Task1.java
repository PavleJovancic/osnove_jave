package p21_08;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
      //Napisati program koji sumira parne brojeve od 1 do 50 i na kraju programa ispisuje sumu.
        Scanner s =new Scanner(System.in);

        int sum = 0;

        for (int i = 1; i <= 50; i ++){
            if (i % 2 == 0){
                sum = sum + i;

            }

        }

    }
}
