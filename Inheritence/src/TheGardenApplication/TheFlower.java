package TheGardenApplication;

public class TheFlower extends Plant {

    public TheFlower(String color, int currentWaterAmount) {
        super(color, currentWaterAmount);
        this.setAbsorbationLevel(0.75);
    }
}
