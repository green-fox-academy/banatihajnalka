package Garage;

public abstract class Car {

    private String licencePlate;
    private String color;
    private int speed;
    private int fuelTank;
    private int currentFuelAmount = 0;

    public Car(String color, int fuelTank) {
        this.color = color;
        this.fuelTank = fuelTank;
    }

    public  int fill(int amountOfFuel) {
        if (currentFuelAmount <= fuelTank) {
            currentFuelAmount += amountOfFuel - fuelTank - currentFuelAmount;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public abstract void honk();
}
