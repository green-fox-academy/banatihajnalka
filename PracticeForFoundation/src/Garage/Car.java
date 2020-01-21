package Garage;

public abstract class Car {

    private String licencePlate;
    private String color;
    private int speed;
    private int fuelTank;
    private int currentFuelAmount;

    public Car(String color, int fuelTank) {
        this.color = color;
        this.fuelTank = fuelTank;
        this.currentFuelAmount = 0;
    }

    public  int fill(int amountOfFuel) {
      if (amountOfFuel > fuelTank) {
          currentFuelAmount = fuelTank;
          return amountOfFuel - fuelTank;
      } else {
          currentFuelAmount = amountOfFuel;
          return 0;
      }
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public abstract void honk();
}
