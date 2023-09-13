package d12_09;

public class Individual {
    private String name;
    private int id;
    private String jmbg;
    private boolean pastPurchase;

    public Individual(){}
    public Individual(String name, int cardID, String jmbg,boolean pastPurchase){
        this.name = name;
        this.id = cardID;
        this.jmbg = jmbg;
        this.pastPurchase = pastPurchase;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setPastPurchase(boolean pastPurchase) {
        this.pastPurchase = pastPurchase;
    }

    public boolean getPastPurchase() {
        return pastPurchase;
    }


    public void printIndividualInformation(){
        System.out.print(this.name + ", " + this.id);
    }



}
