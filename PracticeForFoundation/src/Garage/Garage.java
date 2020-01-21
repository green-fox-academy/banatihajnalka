package Garage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Garage {

    private String adress;
    private int capacity;
    List<Car> garage;

    public Garage() {
        garage = new ArrayList<>();
    }

    public void add(Car car) {
        if (capacity < getHowManyCarsIn()) {
            garage.add(car);
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
            allCarSpeed += car.getSpeed();
        }
        return  allCarSpeed / garage.size();
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

    public HashMap
}
