package d07_09;

public class Task3 {
    public static void main(String[] args) {
//Kreiranje klase "Proizvod"
//Napišite klasu "Proizvod" sa atributima: naziv (String) i cena (double).
// U glavnoj metodi kreirajte 3 objekta ove klase i postavite im vrednosti. Ispisati informacije o proizvodima.


        Product one = new Product();
        Product two = new Product();
        Product three = new Product();

        one.name = "Nike";
        one.price = 199.99;


        two.name = "Puma";
        two.price = 189.59;


        three.name = "Adidas";
        three.price = 200.11;


        System.out.println( one.name + ", " + one.price +  "e" );
        System.out.println( two.name + ", " + two.price +  "e"  );
        System.out.println( three.name + ", " + three.price +  "e" );
    }
}
