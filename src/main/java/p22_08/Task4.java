package p22_08;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // Napisati pogram koji vrsi korkeciju zvuka. Korisnik unosi akcije “pojacaj” ili “smanji” ili “play”.
        // Program radi dok korisnik ne unese play. Inicijalna jacina zvuka je 75.
        //Pojacaj - akcije koja povecava jacinu zvuka za 10
        //smanji - akcija koja smajnjuje jacinu zvuka za 10.
        //Zvuk nakon nijedne akcije ne sme da spadne ispod nule ili da ode preko 100.
        //Na kraju programa odstampati jacinu zvuka.
        //
        //Primer izvrsenja:
        //Unesite akciju: pojacaj (iz 75 u 85)
        //Unesite akciju: pojacaj ( iz 85 u 95)
        //Unesite akciju: pojacaj (iz 95 u 100)
        //Unesite akciju: smanji (iz 100 u 90)
        //Unesite akciju: smanji (iz 90 u 80)
        //Unesite akciju: play
        //Jacina zvuka je 80.

        Scanner s = new Scanner(System.in);

        String action = "";
        int volume = 75;
        boolean condition = false;

        while (!condition) {
            System.out.print("Input action: ");
            action = s.next();
            if (volume - 10 >= 0 && action.equals("decrease")) {
                volume = volume - 10;
            }
            else if (volume - 10 < 0 && action.equals("decrease")){
                volume = 0;
            }
            else if (volume + 10 <= 100 && action.equals("increase")) {
                volume = volume + 10;
            }
            else if (volume + 10 > 100 && action.equals("increase")){
                volume = 100;
            }
            else if (action.equals("play")){
                condition = true;
            }
        }
        System.out.println("Volume is " + volume);


    }
}



