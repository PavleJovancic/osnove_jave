package d08_09;

public class Product {

    public String name;

    public double price;

    public double weight;

    public void printProductInformation(){
        System.out.println(this.name + ", " + this.price + " rsd, "+ this.weight +" g");
    }
    public void increasePriceOfProduct(double increaseValue){
        this.price = price + increaseValue;
    }
    public double discountPriceOfProduct(int discount){

        double discountPrice = this.price * discount/100;
        double discountPriceOfProduct = this.price + discountPrice;
        return discountPriceOfProduct;
    }
    public int calculatePostage() {
        if (this.weight <= 100) {
            return 200;
        } else if (this.weight > 100 && this.weight <= 500) {
            return 400;
        } else {
            return 1000;
        }
    }



}
