package TheGardenApplication;

import java.util.ArrayList;
import java.util.List;

public class Garden extends Plant {
    private String name;
    private List<Plant> plants;
    private int waterAmount;


    public Garden(String name) {
        super();
        plants = new ArrayList<>();
    }

    public void addPlants(Plant plant) {
        plants.add(plant);
    }

    public void watering(int waterAmount) {
        System.out.println("Watering with " + waterAmount);
        List<Plant> thirsty = new ArrayList<>();
        for (int i = 0; i < plants.size(); i++) {
            if (plants.get(i).getIsThirsty()) {
                thirsty.add(plants.get(i));
            }
        }
        for (int i = 0; i <thirsty.size() ; i++) {
           double newWaterAmount = thirsty.get(i).getCurrentWaterAmount() + waterAmount / thirsty.size();
           thirsty.get(i).setCurrentWaterAmount(newWaterAmount);
        }
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<Plant> getPlants() {
        return plants;
    }
    public void setPlants(List<Plant> plants) {
        this.plants = plants;
    }
    public void needsWater() {
        for (int i = 0; i <plants.size() ; i++) {
            if (plants.get(i) instanceof TheFlower && plants.get(i).getIsThirsty()) {
                    System.out.println("The " + plants.get(i).getColor() + " Flower needs water");
            } else if ((plants.get(i) instanceof TheFlower)) {
                System.out.println("The " + plants.get(i).getColor() + " Flower doesn't needs water");
            } else if (plants.get(i) instanceof TheTree && plants.get(i).getIsThirsty()) {
                    System.out.println("The " + plants.get(i).getColor() + " Tree needs water");
            } else {
                System.out.println("The " + plants.get(i).getColor() + " Tree doesn't needs water");
            }
        }
    }
}
