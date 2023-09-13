package d12_09;

public class Transaction {
    private int id;
    private Account receivesFunds;
    private Account sendsFunds;

    public Transaction(){}
    public Transaction(int id, Account receivesFunds, Account sendsFunds){
        this.id = id;
        this.receivesFunds = receivesFunds;
        this.sendsFunds = sendsFunds;
    }

    public Account getReceivesFunds() {
        return receivesFunds;
    }

    public void setReceivesFunds(Account receivesFunds) {
        this.receivesFunds = receivesFunds;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setSendsFunds(Account sendsFunds) {
        this.sendsFunds = sendsFunds;
    }

    public Account getSendsFunds() {
        return sendsFunds;
    }

    public double calculateCommission(int payment){
        if (payment < 4500) {
            return 45;
        } else {
            return payment * 0.01;
        }

    }
    public void makeAnTransaction(int payment){
        double transactionPayment = payment +  this.calculateCommission(payment);
        this.sendsFunds.accountDeduction(transactionPayment);
        this.receivesFunds.accountPayment(transactionPayment);

    }

}
