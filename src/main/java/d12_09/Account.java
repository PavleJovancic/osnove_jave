package d12_09;

public class Account {
    private String number;

    private  String name;
    private double balance;

    public Account(){}
    public Account(String number, String name, double balance){
        this.number = number;
        this.name = name;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void accountPayment(double payment){
        this.balance = this.balance + payment;
    }
    public void accountDeduction(double payment){
        this.balance = this.balance - payment;

    }
    public void printAccountInformation(){
        System.out.println(this.name + " - " + this.number);
        System.out.println("Balance: " + this.balance + " rsd");
        System.out.println();

    }

}
