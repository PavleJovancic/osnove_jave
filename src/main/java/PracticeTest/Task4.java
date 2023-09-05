package PracticeTest;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
//Napisati metodu koja vrsi konverziju metara u cm, dm, km. Metoda kao parametre
//prima vrednost u metrima i jedinicu u kojoj treba izvrsiti konverziju i vraca
//konvertovanu vrednost.
//Podsetnik za konverziju jedinica:
//1m = 100 cm
//1m = 10 dm
//1m = 0.001 km
//Primer poziva metode
//Ako se u metodu prosledi vrednost 15 i jedinica cm, metoda vraca 1500.
//Ako se u metodu prosledi vrednost 1500 i jedinica km, metoda vraca 1.5
//U glavnom programu pozvati metodu za konverziju cm, dm i km i ispisati
//odgovarajuce poruke na ekranu.
//Primer izvrsenja programa:
//3.5m je 350cm
//3.5m je 35dm
//3.5m je 0.0035km
        Scanner s =  new Scanner(System.in);

        System.out.println("Enter number: ");
        double number = s.nextDouble();
        System.out.println("Convert to: ");
        String unit = s.next();

        double convertedNumber = convertUnit(number, unit);
        System.out.println(number + "m is " + convertedNumber + unit);
    }
    public static double convertUnit (double value, String unit){
        double convertedValue = 1.0;
        if (unit.equals("cm")) {
            convertedValue = value * 100;
        } else if (unit.equals("dm")) {
            convertedValue = value * 10;
        } else if (unit.equals("km")) {
            convertedValue = value * 0.001;
        }
        return convertedValue;
    }
}
