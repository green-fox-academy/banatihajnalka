package PetrolStation;
//
//#### Petrol Station
//        - Create `Station` and `Car` classes
//     - `Station`
//        - gasAmount
//        - refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount
//     - `Car`
//        - gasAmount
//        - capacity
//        - create constructor for `Car` where:
//        - initialize gasAmount -> 0
//        - initialize capacity -> 100


import org.w3c.dom.ls.LSOutput;

public class MainPetrolStation {
    public static void main(String[] args) {
        Car auto = new Car();
        Station station = new Station();

        station.refill(auto);
        System.out.println(auto.gasAmountCar);
        System.out.println(station.gasAmountStation);

    }




}
