package AnimalProtection;

public class Animal {
    String ownerName;
    boolean isHealthy;
    int healCost;
    String name;

    public Animal() {
    }


    public Animal(boolean isHealthy) {
        this.ownerName = ownerName;
        this.isHealthy = isHealthy;
        this.healCost = healCost;

    }

    public boolean heal() {
        return isHealthy = true;
    }

    public boolean isAdoptable() {
        return this.isHealthy;
    }

    public String toString() {
        if (!this.isHealthy) {
            return this.name+ " is not healthy (" + this.healCost + "€), and not adoptable";
        } else {
            return this.name + " is healthy, and adoptable";
        }
    }

    public boolean isHealthy() {
        return isHealthy;
    }
}
