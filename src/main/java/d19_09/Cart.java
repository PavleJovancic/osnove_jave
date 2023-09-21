package d19_09;

import java.util.ArrayList;


public class Cart {
    //Kreirati klasu Korpa koja ima:
    //niz ambalaza
    //metodu dodaj ambalazu
    //metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
    //privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust.
    //metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije se prima Super karticu iz koje se cita popust.
    //
    private ArrayList<Packaging> packaging;

    public void addPackaging(Packaging packages){
        packaging.add(packages);
    }

    public Cart() {
        this.packaging = new ArrayList<>();
    }

    public void discardPackaging(String barcode){
        for (int i = 0; i < packaging.size(); i++) {
            if (packaging.get(i).getBarcode().equals(barcode)) {
                packaging.remove(packaging.get(i));
            }
        }
    }
    private double calculateDiscountPrice(int discount){
        double sum = 0;
        for (int i = 0; i < packaging.size(); i++) {
            double discountValue = packaging.get(i).calculatePrice() * discount / 100;
            double discountPrice = packaging.get(i).calculatePrice()  - discountValue;
            sum = sum + discountPrice;
        }
        return sum;
    }
    public void cartPrice(SuperCard superCard){
            System.out.println("Price of the cart is: " + this.calculateDiscountPrice(superCard.getDiscount()) + "rsd");
    }

}
