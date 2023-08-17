package p17_08;

import java.util.Scanner;

public class UvodGrananje3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Input time: ");
        int time = s.nextInt();

        if (time < 18){
            System.out.println("Good day");
        } else {
            System.out.println("Good evening");
        }
        System.out.println("END");

    }
}
