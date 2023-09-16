package d15_09;

public class Player extends Person{

    private int number;
    private String position;
    private boolean captain;

    public Player() {
    }

    public Player(String name, String jmbg, int yearOfBirth, int number, String position, boolean captain) {
        super(name, jmbg, yearOfBirth);
        this.number = number;
        this.position = position;
        this.captain = captain;
    }
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Position: " + this.position);
        System.out.println("Number: " + this.number);
        if (this.captain) {
            System.out.println("Captain of the team");
        }
        System.out.println();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isCaptain() {
        return captain;
    }

    public void setCaptain(boolean captain) {
        this.captain = captain;
    }
}
