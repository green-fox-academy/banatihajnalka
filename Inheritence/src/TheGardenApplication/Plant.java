package TheGardenApplication;

public class Plant {
    private String color;
    private int currentWaterAmount;
    private double absorbationLevel;
    private boolean isThirsty;

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

    public double getCurrentWaterAmount() {
        return currentWaterAmount;
    }

    public double setCurrentWaterAmount(double currentWaterAmount) {
        return this.currentWaterAmount;
    }

    public String getColor() {
        return color;
    }

    public boolean getIsThirsty() {
        return isThirsty;
    }

    public boolean setIsThirsty(boolean isThirsty) {
        return isThirsty;
    }
}

