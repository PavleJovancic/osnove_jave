package d17_08;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Napisati program koji ima informacije koje ucitava informacije sa tastature:
        //Ime
        //Prezime
        //godinu rodjenja
        //I stampa informaicije u formatu:
        //[ime] [prezime] - [startost] god
        //
        //Primer izvrsenja:
        //Ako je ime = Milan, prezime = Jovanovic i godina rodjenja 1995 stapaju se informacije
        //Milan Jovanovic - 26 god

        Scanner s = new Scanner(System.in);

        System.out.print("Input first name: ");
        String firstName = s.next();

        System.out.print("Input last name: ");
        String lastName = s.next();

        System.out.print("Input year of birth: ");
        int yearOfBirth = s.nextInt();

        int currentYear = 2023;
        int age = currentYear - yearOfBirth;

        System.out.println(firstName + " " + lastName + " - " + age + " years");

        System.out.print("END");



    }
}
