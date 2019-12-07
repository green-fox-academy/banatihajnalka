package Zoo;

public abstract class Animal {
    private String name;
    private int age;
    private String gender;
    private boolean isBreeding;
    private String color;
    private int weight;

    Animal() {
    }
    Animal(String name) {
        this.name = name;
    }

    public abstract String breed();

    public String getName() {
        return name;
    }
    public int getWeight() {
        return weight;
    }


}


