package TheGardenApplication;

public class Plant {
    private String color;
    private int currentWaterAmount;
    private double absorbationLevel;
    private boolean isThirsty;

    public Plant() {
    }

    public Plant(String color, int currentWaterAmount) {
        this.color = color;
        this.currentWaterAmount = currentWaterAmount;
    }

    public double getAbsorbationLevel() {
        return absorbationLevel;
    }

    public void setAbsorbationLevel(double absorbationLevel) {
        this.absorbationLevel = absorbationLevel;
    }

    public double getCurrentWaterAmount() {
        return currentWaterAmount;
    }

    public void setCurrentWaterAmount(double currentWaterAmount) {
        this.currentWaterAmount = (int) currentWaterAmount;
    }

    public String getColor() {
        return color;
    }

    public boolean getIsThirsty() {
        return isThirsty;
    }

//    public void setThirsty() {
//        this.isThirsty = isThirsty;
//    }

    public void setIsThirsty(boolean isThirsty) {
        this.isThirsty = isThirsty;
    }

    public boolean isThirsty() {
        return isThirsty;
    }
}