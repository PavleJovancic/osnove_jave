package d21_08;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //Napisati program koji simulira ponasanje speak loud programa. Korisnik unosi N reci a program ispisuje svaku rec na ekranu tako da zadovolji uslov:
        //ako se u unetom tekstu sadrzi ! onda ga ispise tako kako je unet
        //ako se ne sadrzi, program dostampa na kraju
        //	Nakon toga program ispisuje nivo agresivnosti u komunikaciji (u procentima). Svaka uneta rec sa ! utice na agresivnost.
        //	Primer izvrsenja:
        //	Unesite N: 5
        //	Unesite tekst: Cao!
        //	Cao!
        //	Unesite tekst: Hello
        //	Hello!
        //	Unesite tekst: Hi!
        //	Hi!
        //	Unesite tekst: Cuti
        //	Cuti!
        //	Unesite tekst: Ajde!
        //	Ajde!
        //	Nivo agresivnosti 60.
        //	(Objasnjenje, 60% jer je od 5 unetih reci, 3 bilo sa !)

        Scanner s = new Scanner(System.in);

        System.out.print("Input N: ");
        int n = s.nextInt();
        int sum = 0;

        for (int i = 1; i <=n; i++){
            System.out.print("Input text: ");
            String text = s.next();
            if (text.contains("!")){
                System.out.println(text);
                sum = sum + 1;
            } else {
                System.out.println(text + "!");
            }
        }
        System.out.print("level of aggressiveness is "+ sum*100/n + "%");






    }
}
