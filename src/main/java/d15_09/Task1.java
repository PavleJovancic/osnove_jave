package d15_09;

import d14_09.Exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Kreirati klasu Osoba koja ima:
        //ime i prezime
        //jmbg
        //godinu rodjenja
        //default-ni konstuktor
        //konstuktor sa parametrima
        //gettere i settere
        //metodu stampaj koja stampa u formatu:
        //(ime i prezime), (jmbg), (godina rodjenja)
        //
        //Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
        //broj (broj koji igrac nosi)
        //poziciju koju igra (odbrambeni, napadac, … )
        //kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
        //default-ni konstuktor
        //konstuktor sa parametrima
        //gettere i settere za broj, kapiten i poziciju
        //metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
        //
        //Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
        //godine iskustva
        //tip trenera (kondicioni, za igru, pomocni, personalni)
        //metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
        //
        //U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode a zatim kreirati niz igraca i niz trenera, na kraju programa ispisati sve igrace i trenere. Podatke za igrace i trenere unosi korisnik sa tastature.


        Scanner s = new Scanner(System.in);

        ArrayList<Player> players = new ArrayList<>();
        ArrayList<Coach> coaches = new ArrayList<>();

         for (int i = 0; i < 2; i++) {
             System.out.print("Enter player name: ");
             String name = s.next();
             System.out.print("Enter jmbg: ");
             String jmbg = s.next();
             System.out.print("Enter year of birth: ");
             int year = s.nextInt();
             System.out.print("Enter number: ");
             int number = s.nextInt();
             System.out.print("Enter postition: ");
             String position = s.next();
             System.out.print("Is player captain of the team? ");
             boolean captain = s.nextBoolean();
             players.add(new Player(name, jmbg, year, number, position, captain));
         }

         for (int i = 0; i < 2; i++) {
             System.out.print("Enter coach name: ");
             String name = s.next();
             System.out.print("Enter jmbg: ");
             String jmbg = s.next();
             System.out.print("Enter year of birth: ");
             int year = s.nextInt();
             System.out.print("Enter years of experience: ");
             int experience = s.nextInt();
             System.out.print("Enter type of coach: ");
             String type = s.next();
             coaches.add(new Coach(name, jmbg, year, experience, type));
         }

         for (int i = 0; i < players.size(); i++) {
             players.get(i).printInfo();
             System.out.println();
         }
         for (int i = 0; i < coaches.size(); i++) {
             coaches.get(i).printInfo();
             System.out.println();
         }

    }
}
