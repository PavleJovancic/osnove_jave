package miniproject;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GenerateRandomPasswordWithSpecialCharacter {
    public static void main(String[] args) {
        //**Zadatak: Generisanje Random Passworda sa Specijalnim Karakterom**
        //
        //Kako biste saznali više o generisanju random brojeva u programiranju, preporučujemo da istražite sledeći link: random koristeci Random class.
        // Ovaj resurs će vam pružiti detaljnije razumevanje kako programi generišu slučajne brojeve i kako ih možete koristiti u različitim situacijama.
        //
        //Napišite program koji simulira automatsko generisanje random passworda. Korisnik će uneti željenu dužinu passworda, a program će kreirati i ispisati password koji zadovoljava te parametre.
        // Ovaj zadatak zahteva implementaciju različitih metoda za generisanje karaktera i passworda.
        //generisiRandomKarakter: Ova metoda generiše i vraća random karakter. Metoda koristi niz stringova sa elementima koji predstavljaju mala slova, velika slova i brojeve (niz je sa fiksnim vrednostima).
        // Random bira jedan element iz niza i vraća ga kao povreatnu vrednost (string). Ova metoda nema ulazne parametre.
        //generisiRandomSpecijalanKarakter: Ova metoda generiše i vraća random specijalan karakter.
        // Metoda koristi niz stringova sa elementima `@`, `#`, `&`, `*` i `!` (niz je sa fiksnim vrednostima).
        // Random bira jedan element iz niza i vraća ga kao string. Ova metoda nema ulazne parametre.
        //
        //Napomena: Metode generisiRandomSpecijalanKarakter generisiRandomKarakter nemaju nikakvu stampu u sebi!
        //
        //Glavni program:
        //   - Korisnik unosi dužinu passworda i informaciju da li treba sadržati specijalan karakter.
        //   - Koristeći metodu `generisiPassword`, program generiše i ispisuje password.
        //
        //Primer izvršenja 1:
        //Unesite dužinu passworda: 10
        //Da li želite da sadrži specijalan karakter: true
        //Generisan password: eD9Kx0e@
        //
        //Primer izvršenja 2:
        //Unesite dužinu passworda: 10
        //Da li želite da sadrži specijalan karakter: false
        //Generisan password: eCxdwEeFEx

        Scanner s = new Scanner(System.in);

        System.out.print("Enter password length: ");
        int passwordLength = s.nextInt();

        System.out.print("Should password contain special character:  ");
        boolean passwordContainsSpecialCharacter = s.nextBoolean();

        String randomGeneratedPassword = "";

        for (int i = 1; i < passwordLength; i++){
            randomGeneratedPassword = randomGeneratedPassword + generateRandomCharacter();
        }
        if (passwordContainsSpecialCharacter) {
            randomGeneratedPassword = randomGeneratedPassword + generateRandomSpecialCharacter();
        } else {
            randomGeneratedPassword = randomGeneratedPassword + generateRandomCharacter();
        }

        System.out.println(randomGeneratedPassword);
    }
    public static String generateRandomCharacter(){
        ArrayList<String> characters = new ArrayList<>();

        characters.add("A");
        characters.add("B");
        characters.add("C");
        characters.add("D");
        characters.add("E");
        characters.add("F");
        characters.add("G");
        characters.add("H");
        characters.add("I");
        characters.add("J");
        characters.add("K");
        characters.add("L");
        characters.add("M");
        characters.add("N");
        characters.add("O");
        characters.add("P");
        characters.add("Q");
        characters.add("R");
        characters.add("S");
        characters.add("T");
        characters.add("U");
        characters.add("V");
        characters.add("W");
        characters.add("X");
        characters.add("Y");
        characters.add("Z");

        characters.add("a");
        characters.add("b");
        characters.add("c");
        characters.add("d");
        characters.add("e");
        characters.add("f");
        characters.add("g");
        characters.add("h");
        characters.add("i");
        characters.add("j");
        characters.add("k");
        characters.add("l");
        characters.add("m");
        characters.add("n");
        characters.add("o");
        characters.add("p");
        characters.add("q");
        characters.add("r");
        characters.add("s");
        characters.add("t");
        characters.add("u");
        characters.add("v");
        characters.add("w");
        characters.add("x");
        characters.add("y");
        characters.add("z");

        characters.add("1");
        characters.add("2");
        characters.add("3");
        characters.add("4");
        characters.add("5");
        characters.add("6");
        characters.add("7");
        characters.add("8");
        characters.add("9");
        characters.add("0");

        Random rand = new Random();

        int listIndexNumbers = characters.size() - 1;
        int generatedRandomIndex = rand.nextInt(listIndexNumbers);

        return characters.get(generatedRandomIndex);


    }
    public static String generateRandomSpecialCharacter(){
        ArrayList<String> specialCharacters = new ArrayList<>();
        specialCharacters.add("@");
        specialCharacters.add("#");
        specialCharacters.add("&");
        specialCharacters.add("*");
        specialCharacters.add("!");

        Random rand = new Random();

        int listIndexNumbers = specialCharacters.size() - 1;
        int generatedRandomIndex = rand.nextInt(listIndexNumbers);

        return specialCharacters.get(generatedRandomIndex);
    }
}
