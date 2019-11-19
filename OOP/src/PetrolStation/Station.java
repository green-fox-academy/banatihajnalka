package PetrolStation;

public class Station {
    int gasAmountStation;

    public void refill(Car car) {
        car.gasAmountCar =+ car.capacity;
        gasAmountStation =- gasAmountStation;
        System.out.println("The amount of the car capacity was increased by " + car.gasAmountCar + ", and the amount of the station was decreased by " + car.capacity);
    }

}
