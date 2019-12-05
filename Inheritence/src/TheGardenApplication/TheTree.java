package TheGardenApplication;

public class TheTree extends Plant {

    public TheTree(String color, int currentWaterAmount) {
        super(color, currentWaterAmount);
        this.setAbsorbationLevel(0.4);
    }

    public boolean getIsThirsty() {
        if (getCurrentWaterAmount() < 10) {
            return true;
        } else return false;
    }

}