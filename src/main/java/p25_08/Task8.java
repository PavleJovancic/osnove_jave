package p25_08;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Napisati metodu koja vrsi konverziju rimske(string) u arapske brojeve(int).
        //1 - I
        //2 - II
        //3 - III
        //4 - IV
        //5 - V
        //Kao parametar se unosi vrednost rimkog broja(string) a vraca se arapski (int).
        //Ako se unese V vraca se 5. Ako se unese vrednost koja nije podrzana vracamo nulu.

        System.out.println("Input roman: ");
        String roman = s.next();


        int arabic = convertRomanArabic(roman);
        System.out.println(arabic);

    }
    public static int convertRomanArabic(String romanNumeral){
        int arabicNumeral = 0;
        if ( romanNumeral.equals("I")) {
            arabicNumeral = 1;
        } else if ( romanNumeral.equals("V")) {
            arabicNumeral = 5;
        } else if ( romanNumeral.equals("X")) {
            arabicNumeral = 10;
        } else if ( romanNumeral.equals("L")) {
            arabicNumeral = 50;
        } else if ( romanNumeral.equals("C")) {
            arabicNumeral = 100;
        } return arabicNumeral;

    }
}
