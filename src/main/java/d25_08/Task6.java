package d25_08;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        //Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
        //
        //Primer izvrsenja:
        //izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
        //izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1

        Scanner s = new Scanner(System.in);

        System.out.print("Input N: ");
        int n = s.nextInt();
        System.out.print("Input M: ");
        int m = s.nextInt();

        int counter = calculateHowManyWholeNumbers(n,m);

        String x = "";
        for (int i = n; i <= m; i++){
            x = x + i + " ";
        }
        System.out.println("There are " + counter + " numbers between " + n + " and " + m + ". How? "+ x);
    }
    public static int calculateHowManyWholeNumbers(int n, int m){
        int counter = 0;
        for (int i = (n + 1); i < m; i++){
            counter = counter + 1;
        }
        return counter;
    }
}
