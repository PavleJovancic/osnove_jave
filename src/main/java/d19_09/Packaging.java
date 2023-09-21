package d19_09;

public abstract class Packaging {
    ////Kreirati abstraktnu klasu Ambalaza koja ima:
    //        //barkod (primer: 328232-2823)
    //        //naziv artikla
    //        //neto tezinu
    //        //bruto tezinu
    //        //konstuktore (default-ni i sa parametrima)
    //        //gettere i settere
    //        //metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
    //        //abstraktnu metodu koja vraca cenu artikla
    //        //abstraktnu metodu stampaj
    //        //
    protected String barcode;
    protected String item;
    protected int neto;
    protected int bruto;

    public Packaging() {
    }

    public Packaging(String barcode, String item, int neto, int bruto) {
        this.barcode = barcode;
        this.item = item;
        this.neto = neto;
        this.bruto = bruto;
    }




    public int calculateWeight(){
        int weight = this.bruto - this.neto;
        return weight;
    }
    public abstract double calculatePrice();

    public abstract void print();


    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getNeto() {
        return neto;
    }

    public void setNeto(int neto) {
        this.neto = neto;
    }

    public int getBruto() {
        return bruto;
    }

    public void setBruto(int bruto) {
        this.bruto = bruto;
    }
}
