package miniproject;

import java.util.ArrayList;

public class Simulation_UserMapping_Slack {
    public static void main(String[] args) {
        //**Zadatak: Simulacija iscrtavanja korisnika na Slacku**
        //
        //Napišite program koji simulira prikazivanje korisnika na Slacku.
        // Prikaz korisnika treba da se izvede tako da prvo budu prikazani aktivni korisnici, a potom neaktivni.
        // Program će čuvati sledeće informacije:
        //Niz korisnika - u ovom nizu će biti sačuvani svi korisnici koji imaju pristup Slacku.
        //Niz aktivnosti - svaki korisnik će biti označen kao aktivan ili neaktivan.
        // Informacije o aktivnostima biće čuvane u nizu gde će za svakog korisnika biti zabeleženo da li je trenutno aktivan ili ne  (true ili false)..
        // Naravno, korisnik i njegova aktivnost će biti upareni po istom indeksu.
        // To znači da će se za korisnika na poziciji N u nizu "korisnici" čitati aktivnost sa pozicije N u nizu "aktivnosti".
        //
        //Program će ispisivati informacije za svakog korisnika na sledeći način:
        //Za aktivne korisnike:
        //  | slika |o Ime Prezime
        //Za neaktivne korisnike:
        //  | slika |x Ime Prezime
        //
        //Na primer, ako je niz korisnika:
        //Pera Peric
        //Darko Darkovic
        //Marko Markovic
        //Stefan Stefanovic
        //Uros Urosevic
        //Milan Milanovic
        //
        //I ako su aktivnosti korisnika:
        //
        //true
        //false
        //true
        //true
        //false
        //true
        //
        //Program treba da ispiše:
        //
        //| slika |o Pera Peric
        //| slika |o Marko Markovic
        //| slika |o Stefan Stefanovic
        //| slika |o Milan Milanovic
        //| slika |x Darko Darkovic
        //| slika |x Uros Urosevic

        ArrayList<String> usersFullName = new ArrayList<>();

        usersFullName.add("Kristopher Reed");
        usersFullName.add("Mattie Paul");
        usersFullName.add("Lorelei Vaughan");
        usersFullName.add("Will Holder");
        usersFullName.add("Bradley Mcmillan");
        usersFullName.add("Danika Braun");
        usersFullName.add("Ismael Melendez");
        usersFullName.add("Tessa Ware");
        usersFullName.add("Franklin Bowen");
        usersFullName.add("Ryann Arroyo");
        usersFullName.add("Darion Mayo");
        usersFullName.add("Fatima Campos");

        ArrayList<Boolean> activeStatus = new ArrayList<>();

        activeStatus.add(false);
        activeStatus.add(false);
        activeStatus.add(false);
        activeStatus.add(false);
        activeStatus.add(false);
        activeStatus.add(true);
        activeStatus.add(false);
        activeStatus.add(false);
        activeStatus.add(true);
        activeStatus.add(true);
        activeStatus.add(true);
        activeStatus.add(false);

        int numberOfUsers = usersFullName.size() - 1;

        for (int i = 0; i <= numberOfUsers; i++){
            if (activeStatus.get(i)) {
                System.out.println("| picture |o " + usersFullName.get(i));
            }
        }
        for (int i = 0; i <= numberOfUsers; i++){
            if (!activeStatus.get(i)) {
                System.out.println("| picture |x " + usersFullName.get(i));
            }
        }
    }
}
