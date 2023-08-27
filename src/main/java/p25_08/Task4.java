package p25_08;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik za dva prosledjena broja.
        // Brojevi su ulazni parametri funkcije. U gravnom programu pozvati nekoliko puta funkciju sa razlicitim prosledjenim vrednostima
        System.out.println("First number:");
        int firstNumber = s.nextInt();
        System.out.println("Second number:");
        int secondNumber = s.nextInt();

        printMathFunction(firstNumber, secondNumber);
    }
    public static void printMathFunction(int firstNumber, int secondNumber){
        System.out.println(firstNumber + secondNumber);
        System.out.println(firstNumber - secondNumber);
        System.out.println(firstNumber * secondNumber);
        System.out.println(firstNumber / secondNumber);

    }
}
