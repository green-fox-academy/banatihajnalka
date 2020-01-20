package FishTank;

public class Tang extends Fish {

    boolean hasSTML;

    public Tang(String name) {
        super(name, 12, "yellow");
        this.hasSTML = true;
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
