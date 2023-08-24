package p22_08;

import java.util.Scanner;

public class UvodWhile {
    public static void main(String[] args) {
        //

        Scanner s = new Scanner(System.in);

       int number = -1;

        while (number !=0) {
            System.out.println("Input number: ");
            number = s.nextInt();
            System.out.println("Number you entered is " + number);
        }
        System.out.println("END");
    }
}
