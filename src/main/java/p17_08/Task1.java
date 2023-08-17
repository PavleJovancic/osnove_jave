package p17_08;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Input First Name: ");
        String firstName = s.next();

        System.out.print("Input Last Name: ");
        String lastName = s.next();

        System.out.print("Input Phone Number: ");
        String phoneNumber = s.next();

        System.out.print("Input eMail address: ");
        String eMail = s.next();

        System.out.print("Input JMBG: ");
        String jmbg = s.next();

        System.out.println(firstName + " " + lastName + " - " + jmbg);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Email: " + eMail);


// Napisati program koji sa tastature ucitava ime, prezime, broj telefona, email  i jmbg korisnika prikazuje u formatu:
//[Ime] [Prezime] - [JMBG]
//Broj Tel: [Broj telefona],
//Email: [Email],
//
//Unesite ime: Milan
//Unesite prezime: Jovanvoci
//Unesite broj: +209329832
//Unesite email: milan@gmail.com
//Unesite jmbg: 329032938923
//
//Milan Jovanovic - 329032938923
//Broj tel:  +209329832
//Email: milan@gmail.com
    }
}
