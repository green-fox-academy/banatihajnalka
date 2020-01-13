package FishTank;

public class Kong extends Fish {

    public Kong(String name, int weight) {
        super(name, weight, "yellow");
    }

    @Override
    public void status() {
        System.out.println(this.getName() + " , weight: " + this.getWeight() + " , color: " + this.getColor());
    }

    @Override
    public void feed() {
        setWeight(getWeight() + 2);
    }
}
