package TheGardenApplication;

public class TheFlower extends Plant {

    public TheFlower(String color, int currentWaterAmount) {
        super(color, currentWaterAmount);
        this.setAbsorbationLevel(0.75);
//        this.setThirstyLevel(5);
    }

    public boolean getIsThirsty() {
        if (getCurrentWaterAmount() < 5) {
            return true;
        } else return false;
    }
}