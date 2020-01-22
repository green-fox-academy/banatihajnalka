package Garage;

import java.util.*;

public class Garage {

    private String adress;
    private int capacity;
    List<Car> garage;
    HashMap<Car, String> licenceToCars;

    public Garage() {
        garage = new ArrayList<>();
        licenceToCars = new HashMap<Car, String>();
        this.capacity = 15;
        this.adress = "Valencia";
    }

    public void add(Car car, String licencePlate) {
        if (capacity > getHowManyCarsIn()) {
            garage.add(car);
            licenceToCars.put(car, licencePlate);
        } else {
            System.out.println("There is no capacity to add new car");
        }
    }

    public int getHowManyCarsIn() {
        return garage.size();
    }

    public int averageCarSpeed() {
        int allCarSpeed = 0;
        for (Car car : garage) {
            allCarSpeed += car.getSpeed() / garage.size();
        }
        return allCarSpeed;
    }

    public HashMap<String, Integer> getCarColors() {
        ArrayList<String> colors = new ArrayList<>();
        HashMap<String, Integer> carColorOccurence = new HashMap<>();

        for (Car car : garage) {
            colors.add(car.getColor());
        }
        for (String color : colors) {
            Integer count = carColorOccurence.get(color);
            carColorOccurence.put(color, (count == null) ? 1 : count + 1);
        }
        return carColorOccurence;
    }

    public String getCar (String licencePlate) {
       String licenceWithCar = "ERROR: No such license plate is found.";
        for (Map.Entry<Car, String> entry : licenceToCars.entrySet()) {
            if (licencePlate.equals(entry.getValue())) {
                licenceWithCar = entry.getKey().toString() + " = " + entry.getValue();
            }
        }
        return licenceWithCar;
    }

//    public List<String> getCarSecond (String licencePlate) {
//        List<String> lWC = new ArrayList<>();
//        for (int i = 0; i < garage.size(); i++) {
//            if (garage.get(i).getLicencePlate().equals(licencePlate)) {
//                lWC.add(licencePlate);
//                lWC.add(garage.get(i).getClass().getSimpleName());
//            }
//        }
//        return lWC;
//    }

    public int fill(int amount) {
        List<Car> cars = new ArrayList<Car>();
        for (Car car : garage) {
            cars.add(car);
        }
        while (amount > 0 && cars.size() > 0) {
            Car currentCar = cars.get(random(cars.size()));
            amount = currentCar.fill(amount);
            cars.remove(currentCar);
        }
        return amount;
    }

    public void makeItLoud() {
        for (Car car : garage) {
            car.honk();
        }
    }

    public int random(int size) {
        return new Random().nextInt(size);
    }
}
