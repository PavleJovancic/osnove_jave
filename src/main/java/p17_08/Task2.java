package p17_08;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        //Napisati program koji sa tastature ucitava tri cela broja:
        //dan
        //mesec
        //godina
        //	I formira datum u ispisu u formatu dan-mesec-godina

        Scanner s = new Scanner(System.in);

        System.out.print("Input day: ");
        int day = s.nextInt();

        System.out.print("Input month: ");
        int month = s.nextInt();

        System.out.print("Input year: ");
        int year = s.nextInt();

        System.out.println(day +"-" + month + "-"+ year);
    }
}
