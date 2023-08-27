package d25_08;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //Napisati metodu koja stampa podatke o korisniku u formatu:
        //JMBG: [jmbg]
        //Ime: [ime]
        //Prezime: [prezime]
        //God. rodjenja: [god]
        //Aktivan: [true/false]
        //Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.Metoda nista ne vraca.
        Scanner s = new Scanner(System.in);

        System.out.print("Input JMBG: ");
        String jmbg = s.next();
        System.out.print("Input First Name: ");
        String firstName = s.next();
        System.out.print("Input Last Name: ");
        String lastName = s.next();
        System.out.print("Input Year of Birth: ");
        int yearOfBirth = s.nextInt();
        System.out.print("Input activity: ");
        boolean active = s.nextBoolean();

        printPersonalInformation(jmbg, firstName, lastName, yearOfBirth, active);
    }
    public static void printPersonalInformation (String jmbg, String firstName, String lastName, int yearOfBirth, boolean active){
        System.out.println("JMBG: " + jmbg);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Year of Birth: " + yearOfBirth);
        System.out.println("Active: " + active);
    }
}
