package FishTank;

public class Clownfish extends Fish {

    private String stripeColor;

    public Clownfish(String name, int weight) {
        super(name, weight, "blue");
        this.stripeColor = "black";
    }

    @Override
    public void status() {
        System.out.println(this.getName() + " , weight: " + this.getWeight() + " , color: " + this.getColor() + " with " + this.stripeColor + " stripes");
    }

    @Override
    public void feed() {
        setWeight(getWeight() + 1);
    }
}
