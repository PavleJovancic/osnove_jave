package p18_08;

import java.util.Scanner;

public class ForPlusIF {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("<");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.print(" 50%");
            }
            System.out.print(" |");
        }
    }
}
