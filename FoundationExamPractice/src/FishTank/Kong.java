package FishTank;

public class Kong extends Fish {

    public Kong(String name) {
        super(name, 7, "black");
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
