package d07_09;

public class Task2 {
    public static void main(String[] args) {
//Kreiranje klase "Automobil"
//Napišite klasu "Automobil" sa atributima: marka (String), model (String) i godinaProizvodnje (int).
// U glavnoj metodi kreirajte 2-3 objekta ove klase i postavite im vrednosti. Ispisati informacije o automobilima.

        Car one = new Car();
        Car two = new Car();
        Car three = new Car();

        one.brand = "Opel";
        one.model = "Corsa";
        one.yearOfProduction = 2003;

        two.brand = "Opel";
        two.model = "Meriva";
        two.yearOfProduction = 2006;

        three.brand = "Citroen";
        three.model = "C3";
        three.yearOfProduction = 2015;

        System.out.println( one.brand + ", " + one.model +  ", " + one.yearOfProduction );
        System.out.println( two.brand + ", " + two.model +  ", " + two.yearOfProduction );
        System.out.println( three.brand + ", " + three.model +  ", " + three.yearOfProduction );

    }
}
