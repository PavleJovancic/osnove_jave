package p17_08;

import java.util.Scanner;

public class UvodScanner {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Input First Name:");
        String firstName = s.next();
        System.out.print("Input Last Name:");
        String lastName = s.next();
        System.out.print("Input Weight:");
        double weight = s.nextDouble();
        System.out.print("Input Activity:");
        boolean active = s.nextBoolean();

        System.out.println("Full Name: " + firstName + " " + lastName);
        System.out.println("Weight and Activity: " + weight + " "  + active);

//        System.out.print("Input first number:");
//        int a = s.nextInt();
//        System.out.print("Input second number:");
//        int b = s.nextInt();
//
//        int zbir = a + b;
//        int razlika = a - b;
//        int proizvod = a * b;
//        double kolicnik = 1.0 * a / b;
//
//        System.out.println("a: " + a);
//        System.out.println("b: " + b);
//        System.out.println("Zbir je " + zbir);
//        System.out.println("Razlika je " + razlika);
//        System.out.println("Proizvod je " + proizvod);
//        System.out.println("Kolicnik je " + kolicnik);



    }


}
