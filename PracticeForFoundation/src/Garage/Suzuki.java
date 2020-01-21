package Garage;

public class Suzuki extends Car {

    public Suzuki(String color, int fuelTank) {
        super(color, fuelTank);
    }

    @Override
    public void honk() {
        System.out.println("Tu-tu");
    }
}
