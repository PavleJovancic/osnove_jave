package p21_08;

import java.util.Scanner;

public class PetljeNastavak {
    public static void main(String[] args) {
      //
        Scanner s =new Scanner(System.in);

        int  sum = 0;

        for (int i = 1; i <= 10; i++){
            sum = sum + i;
        }
        System.out.print("Suma " + sum);
    }

}
