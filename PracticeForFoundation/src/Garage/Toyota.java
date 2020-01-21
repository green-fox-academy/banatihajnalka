package Garage;

public class Toyota extends Car {

    public Toyota() {
        super("white", 40);
    }

    @Override
    public void honk() {
        System.out.println("Tu-Tu");
    }
}
