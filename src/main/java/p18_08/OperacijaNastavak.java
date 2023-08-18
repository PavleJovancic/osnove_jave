package p18_08;

import java.util.Scanner;

public class OperacijaNastavak {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = 10;
        String action = "increase";

        if (action.equals("increase")) {
            a = a + 10;
        }


        System.out.print(a);
    }
}
