package d12_09;

public class Contract {
    private String date;
    private Individual buyer;
    private Individual seller;
    private double price;
    private String address;

    public Contract(){}
    public Contract(String date, Individual buyer, Individual seller, double price, String address){
        this.date = date;
        this.buyer = buyer;
        this.seller = seller;
        this.price = price;
        this.address = address;
    }


    public double percentOfProfit () {
        if (this.buyer.getPastPurchase()) {
            return 0.02;
        } else {
            return 0.03;
        }
    }

    public double agencyProfit () {
        double agencyProfit = 1000 + this.price * this.percentOfProfit();
        return agencyProfit;

    }

    public void printContractInformation(){
        System.out.print("Dana " + this.date + " god sklopljen je ugovor izmedju ");
        this.seller.printIndividualInformation();
        System.out.print(" i ");
        this.buyer.printIndividualInformation();
        System.out.print(" o kupovini nekretnine " + this.address + " po ceni od " + this.price + " pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost u iznosu od " +  this.agencyProfit() + " din");

    }
}
