package FishTank;

public class ClownFish extends Fish {

    private String stripeColor;

    public ClownFish(String name) {
        super(name, 24, "orange");
        this.stripeColor = "white";
    }

    @Override
    public void feed() {
        this.weight += 1;
    }

    @Override
    public void status() {
        System.out.println(this.name + ", weight: " + this.weight + ", color: " + this.color + " short-term memory loss: " + this.hasSTML);
    }
}
