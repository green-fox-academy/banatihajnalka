package Garage;

public abstract class Car {

    private String licencePlate;
    private String color;
    private int speed;
    private int fuelTank;
    private int currentFuelAmount;

    public Car(String color, int fuelTank, int speed) {
        this.color = color;
        this.fuelTank = fuelTank;
        this.speed = speed;
        this.currentFuelAmount = 0;
    }

    public int fill(int amountOfFuel) {
        int neededFuel = fuelTank - currentFuelAmount;
        if (neededFuel > amountOfFuel) {
            neededFuel = amountOfFuel;
        }
        currentFuelAmount += neededFuel;
        return amountOfFuel - neededFuel;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public abstract void honk();

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
