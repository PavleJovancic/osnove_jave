package p22_08;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        //Napisati program koji simulira ponasanje jednog test case-a. Test case ima 5 provera, a program validira jednu po jednu proveru sve dok ne proveri sve ili dok neka provera ne failuje.
        // Korisnik sa tastature za svaku proveru unosi expected rec i actual rec. U slucaju fail-a ispisati odgovarajucu poruku.
        //	Primer izvrsenja 1:
        //	Unesite expected: hello
        //	Unesite actual: hello
        //Unesite expected: hello1
        //	Unesite actual: hello1
        //Unesite expected: hello2
        //	Unesite actual: hello
        //	Error: Expected hello2 but got hello.
        //
        //Primer izvrsenja 2:
        //	Unesite expected: hello
        //	Unesite actual: hello
        //Unesite expected: hello1
        //	Unesite actual: hello1
        //Unesite expected: hello2
        //	Unesite actual: hello2
        //Unesite expected: hello3
        //	Unesite actual: hello3
        //Unesite expected: hello4
        //	Unesite actual: hello4
        //Unesite expected: hello5
        //	Unesite actual: hello6
        //	Test passed.

        Scanner s = new Scanner(System.in);

        String expected = "0";
        String actual = "0";
        int counter = 0;
        boolean condition = false;

        while (!condition) {
            System.out.print("Input Expected Result: ");
            expected = s.next();
            System.out.print("Input Actual Result: ");
            actual = s.next();

            counter = counter + 1;
            if (counter == 5 && expected.equals(actual)) {
                System.out.print("Test passed");
                condition = true;
            }
            if (!expected.equals(actual)) {
                System.out.println("Error: Expected " + expected + " but got " + actual);
                condition = true;
            }
        }
    }
}
