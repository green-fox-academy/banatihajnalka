package AnimalProtection;

import java.util.Random;

public class Dog extends Animal {

    public Dog(boolean isHealthy) {
        this.name = "dog";
        this.isHealthy = isHealthy;
        this.healCost = new Random().nextInt((8) + 1);
    }
}
