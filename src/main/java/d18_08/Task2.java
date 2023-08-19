package d18_08;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        //Napisati program koji simulira stampanje ocitane licne karte u vise primeraka. Korisnik unosi podatke :
        //ime
        //prezime
        //jmbg
        //broj primeraka za stampu
        //Primer izvrsenja:
        //Unesite ime: Milan
        //Unesite prezime: Jovanovic
        //Unesite jmbg: 2109238932232
        //Unesite broj primeraka za stampu: 3
        //
        //Primerak 1
        //**********************************
        //Ime i prezime: Milan Jovanovic
        //JMBG: 2109238932232
        //**********************************
        //
        //Primerak 2
        //**********************************
        //Ime i prezime: Milan Jovanovic
        //JMBG: 2109238932232
        //**********************************
        //
        //Primerak 3
        //**********************************
        //Ime i prezime: Milan Jovanovic
        //JMBG: 2109238932232
        //**********************************

        Scanner s =new Scanner(System.in);
        System.out.print("First Name: ");
        String firstName = s.next();

        System.out.print("Last Name: ");
        String lastName = s.next();

        System.out.print("JMBG: ");
        String jmbg = s.next();

        System.out.print("Number of copies: ");
        int copies = s.nextInt();

        for (int i = 1; i <=copies; i++){
            System.out.println("Copy " + i);
            System.out.println("**********************************");
            System.out.println("Full Name: " + firstName + " " + lastName);
            System.out.println("JMBG: " + jmbg );
            System.out.println("**********************************");
        }
        System.out.print("END");


    }
}
