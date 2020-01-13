package FishTank;

public abstract class Fish {

    private String name;
    private int weight;
    private String color;

    public Fish() {
    }
    public Fish(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public abstract void status();

    public abstract void feed();

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
}
