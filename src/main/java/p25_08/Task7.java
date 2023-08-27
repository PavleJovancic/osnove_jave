package p25_08;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Napisati metodu koja proverava da li je trougao pravougli. Metoda prima stranice trougla i hipotenuzu trougla.
        // Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.
        //Trougao je pravougli ukoliko je a*a+b*b=c*c

        System.out.println("Input x: ");
        int x = s.nextInt();
        System.out.println("Input y: ");
        int y = s.nextInt();
        System.out.println("Input z: ");
        int z = s.nextInt();

        boolean t = isTriangleRight( x , y, z);

        if (t==true) {
            System.out.println("This is  right triangle");
        } System.out.println("This is not right triangle");

    }
    public static boolean isTriangleRight(int a, int b, int c){
        boolean triangle = true;
        if ( a * a + b * b == c * c){
            triangle = true;
        } else{
            triangle = false;
        } return triangle;

    }
}
