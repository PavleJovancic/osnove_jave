package d25_08;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        //Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3.
        // U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.
        //
        //Ako se proslede brojevi 4,6,1 u poziv metode, metoda vraca 1
        //Ako se proslede brojevi 4,6,33 u poziv metode, metoda vraca 4

        Scanner s = new Scanner(System.in);

        System.out.print("Input number a: ");
        int a = s.nextInt();
        System.out.print("Input number b: ");
        int b = s.nextInt();
        System.out.print("Input number c: ");
        int c = s.nextInt();

        int lowestNumber = determinelowestNumber(a, b, c);
        System.out.println("Lowest number is " + lowestNumber);
    }
    public static int determinelowestNumber (int x, int y, int z){
        int lowestNumber = 0;
        if (x < y && x < z){
            lowestNumber = x;
        } else  if (y < x && y < z){
            lowestNumber = y;
        } else  if (z < x && z < y){
            lowestNumber = z;
        }
        return lowestNumber;
    }

}
