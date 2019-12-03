package TheGardenApplication;

public class Plant {
    private String color;
    private int currentWaterAmount;
    private double absorbationLevel;

    public Plant() {
    }
    public Plant(String color, double absorbationLevel) {
        this.color = color;
        this.currentWaterAmount = currentWaterAmount;
    }
    public double getAbsorbationLevel() {
        return absorbationLevel;
    }
    public double setAbsorbationLevel(double absorbationLevel) {
        return absorbationLevel;
    }
    public int getCurrentWaterAmount() {
        return currentWaterAmount;
    }
    public int setCurrentWaterAmount() {
        return currentWaterAmount;
    }

    public String getColor() {
        return color;
    }
}

