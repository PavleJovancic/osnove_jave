package d19_09;

public class SuperCard {
    //Kreirati klasu SuperKartica koja ima:
    //broj kartice
    //ime i prezime vlasnika
    //popust (200, 500, … )
    //konstuktore (default-ni i sa parametrima)
    //gettere i settere
    //metodu stampaj koja stampa karticu u formatu:
    //(broj kartice), (ime i prezime)
    //
    //
    private String number;
    private String  owner;
    private int discount;

    public SuperCard() {
    }

    public SuperCard(String number, String owner, int discount) {
        this.number = number;
        this.owner = owner;
        this.discount = discount;
    }

    public void printCardInfo(){
        System.out.println(this.number + ", " + this.owner);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
