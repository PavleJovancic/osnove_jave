package p17_08;

import java.util.Scanner;

public class UvodGrananje {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input x: ");
        int x = s.nextInt();
        System.out.println("Input y: ");
        int y = s.nextInt();


        if (x > y) {
            System.out.println(x + " is greater than " + y);
        }
        System.out.println("END");



    }
}