package AnimalProtection;
import java.util.Random;

public class Cat extends Animal {

    public Cat(boolean isHealthy) {
        this.name = "cat";
        this.isHealthy = isHealthy;
        this.healCost = new Random().nextInt(7);
    }
}
