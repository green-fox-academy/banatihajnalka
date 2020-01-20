package FishTank;

public abstract class Fish {
    String name;
    int weight;
    String color;
    boolean hasSTML;


    public Fish(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public abstract void feed();

    public abstract void status();

    public int getWeight() {
        return weight;
    }
}
