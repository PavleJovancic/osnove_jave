package p18_08;

import java.util.Scanner;

public class GrananjeNastavak {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int time = 13;
        if(time < 12) {
            System.out.println("Goodmorning.");
        }  else if (time == 12) {
            System.out.println("Good afternoon.");
        }
        else if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        System.out.print("END");
    }
}
