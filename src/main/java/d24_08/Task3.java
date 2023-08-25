package d24_08;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //Napisati progam koji stampa niz u obrnutom redosledu tj. od zadnjeg elementa do nultog.
        //Ako je niz 1,2,4,5,7, stampa se 7,5,4,2,1
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner s = new Scanner(System.in);



        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);

        int numberPlace = numbers.size()- 1;

        for (int i = 0; i < numbers.size(); i++){
            int reverseNumber = numbers.get(numberPlace);
            System.out.print(reverseNumber + ", ");
            numberPlace = numberPlace - 1;
        }

    }
}
