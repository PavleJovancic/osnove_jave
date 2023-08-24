package p24_08;

import java.util.ArrayList;
import java.util.Scanner;

public class UvodNizovi2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(545);
        numbers.add(1);
        numbers.add(23);
        numbers.add(99);

        for (int i = 0; i < numbers.size();i++){
            int x = numbers.get(i);
            System.out.print(x + ", ");
        }
    }
}
