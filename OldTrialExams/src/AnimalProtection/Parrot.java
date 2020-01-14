package AnimalProtection;

import java.util.Random;

public class Parrot extends Animal {

    public Parrot(boolean isHealthy) {
      this.name = "parrot";
      this.isHealthy = isHealthy;
      this.healCost = new Random().nextInt(7) + 4;
    }
}
