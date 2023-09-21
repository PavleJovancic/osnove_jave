package d19_09;

public class GlassPackaging extends Packaging {
    //Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
    //kaucija za flasu
    //atribut koji kaze da li se za flasu placa kaucija
    //osnovna cena
    //gettere i setter za atribute
    //konstuktori koji su vam potrebni
    //racuna cenu
    //ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
    //ako se ne placa, (osnovna cena) * 1.2
    //metoda stampaj stampa sve podatke iz klase staklena flasa.

    private int deposit;
    private boolean hasDeposit;
    private double price;

    public GlassPackaging(String barcode, String item, int neto, int bruto, int deposit, boolean hasDeposit, double price) {
        super(barcode, item, neto, bruto);
        this.deposit = deposit;
        this.hasDeposit = hasDeposit;
        this.price = price;
    }

    @Override
    public double calculatePrice() {
        if (hasDeposit) {
            return this.price * 1.2 + deposit;
        } else {
            return this.price * 1.2;
        }
    }

    @Override
    public void print() {
        if (hasDeposit) {
            System.out.println("This package has deposit");
        } else {
            System.out.println("This package doesn't have deposit");
        }
        System.out.println("Price: " + this.calculatePrice());
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public boolean isHasDeposit() {
        return hasDeposit;
    }

    public void setHasDeposit(boolean hasDeposit) {
        this.hasDeposit = hasDeposit;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}



