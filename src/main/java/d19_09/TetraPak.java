package d19_09;

public class TetraPak extends Packaging{
    // //Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
    //        //atribut koji kaze da li se moze reciklirati
    //        //osnovna cena
    //        //gettere i setter za atribute
    //        //konstuktori koji su vam potrebni
    //        //racuna cenu tako da ispunjava uslova:
    //        //ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
    //        //ako nije u cenu ulazi samo osnovna cena
    //        //metoda stampaj stampa sve podatke iz klase tetrapak.
    //        //
    //        //
    private boolean recyclable;
    private double price;

    public TetraPak(boolean recyclable, double price) {
        this.recyclable = recyclable;
        this.price = price;
    }

    public TetraPak(String barcode, String item, int neto, int bruto, boolean recyclable, double price) {
        super(barcode, item, neto, bruto);
        this.recyclable = recyclable;
        this.price = price;
    }
    @Override
    public double calculatePrice() {
        if (recyclable){
            return calculateWeight() * 1.5 + this.price;
        } else {
            return this.price;
        }
    }

    @Override
    public void print() {
        if (isRecyclable()) {
            System.out.println("This package is recyclable");
        } else {
            System.out.println("This package is not recyclable");
        }
        System.out.println("Price: " + this.calculatePrice());
    }




    public boolean isRecyclable() {
        return recyclable;
    }

    public void setRecyclable(boolean recyclable) {
        this.recyclable = recyclable;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



}
