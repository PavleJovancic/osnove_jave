package PracticeTest;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
//Napisati program koji simulira sumiranje vrednosti po koloni u eksel tabeli. Program
//ima niz brojeva duzine 25, koji izgleda kao tabela 5x5, niz je sa fiksnim vrednostima
//tj. ne unosi ih korisnik. Program stampa tabelu na ekranu a zatim od korisnika trazi
//da unese kolonu po kojoj bi zeleo da sumira vrednosti i na kraju programa ispisuje
//sumu za trazenu kolonu.
//Primer izvrsenja:
//3,1,8,0,1,
//1,5,7,9,6,
//3,1,6,5,1,
//4,5,8,1,7,
//1,3,2,8,0,
//Unesite kolonu za sumiranje: 2
//Suma je 31 (Objasnjenje: jer se sumira 8+7+6+8+2, pogledaj sliku)
//
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(1);
        numbers.add(8);
        numbers.add(0);
        numbers.add(1);
        numbers.add(1);
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);
        numbers.add(6);
        numbers.add(3);
        numbers.add(1);
        numbers.add(6);
        numbers.add(5);
        numbers.add(1);
        numbers.add(4);
        numbers.add(5);
        numbers.add(8);
        numbers.add(1);
        numbers.add(7);
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        numbers.add(8);
        numbers.add(0);

        int counter = 0;


        for(int i = 0; i <= numbers.size() - 1 ; i++){
            System.out.print(numbers.get(i) + ",");
            counter = ++counter;
            if ( counter % 5 == 0){
                System.out.println();
            }
        }
        System.out.println("Column number for sum: ");
        int indexNumber =s.nextInt() - 1;
        int sum = 0;
        for (int i = 1; i<=5; i++){

            sum = sum + numbers.get(indexNumber);
            indexNumber = indexNumber + 5;
        }
        System.out.println("Sum is: " + sum);
    }


}
