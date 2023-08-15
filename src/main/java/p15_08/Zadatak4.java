package p15_08;

public class Zadatak4 {
    public static void main(String[] args) {

// Napisati program koji na ekranu stampa podatke u formatu:
// Sifra [SIFRA PROIZVODA]
// [NAZIV PROIZVODA]  - $[CENA] - Popust [POPUST]%
// [BOJA], [VELICINA]
//
// Svaku informaciju za proizvod je potrebno cuvati u okviru zasebne promenljive.
//
// Primer izvrsenja:
// Sifra x932k20
// Nike Patike - $90 - Popust 13.5%
// Crna, 46.5

        String productCode = "tz32x42";
        String productName = "Blue T-shirt";
        double price = 30.99;
        int sale = 15;
        String color = "blue";
        String size = "XXL";

        System.out.println("Product code: " + productCode);
        System.out.println(productName + " - $" + price + " - sale " + sale + "%");
        System.out.println(color + ", "+ size);






    }
}
