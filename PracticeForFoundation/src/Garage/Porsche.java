package Garage;

public class Porsche extends Car {

    public Porsche(String color) {
        super(color, 60, 200);
    }

    public double turbo() {
        return this.getSpeed() * 1.25;
    }

    @Override
    public void honk() {
        System.out.println("Tu-turu-turu");
    }
}
