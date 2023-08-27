package d25_08;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        //Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
        //Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se
        //  / / / / /

        Scanner s = new Scanner(System.in);

        System.out.print("Input N: ");
        int n = s.nextInt();
        System.out.print("Input character: ");
        String character = s.next();

        printCharacter(n, character);
    }
    public static void printCharacter (int n, String character){
        for (int i = 1; i <= n; i++){
            System.out.print(character + " ");
        }

    }
}
