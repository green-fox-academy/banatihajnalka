package AnimalProtection;

import java.util.ArrayList;
import java.util.Random;

public class AnimalShelter {
    private int budget;
    ArrayList<Animal> animals;
    ArrayList<String> adopters;

    public AnimalShelter() {
        this.budget = 50;
        animals = new ArrayList<>();
        adopters = new ArrayList<>();
    }

    public int rescue(Animal animal) {
        animals.add(animal);
        return animals.size();
    }

    public int heal() {
        int amountOfHealedAnimals = 0;
        for (Animal toHeal : animals) {
            if (!toHeal.isHealthy() && budget >= toHeal.healCost) {
                toHeal.heal();
                budget -= toHeal.healCost;
                amountOfHealedAnimals++;
            }
        }
        return amountOfHealedAnimals;
    }

    public void  addAdopter(String name) {
        adopters.add(name);
    }

    public void findNewOwner() {
//        int isThereMatchingPair = 0;
//        while (isThereMatchingPair <= 2) {
            for (int i = 0; i < adopters.size(); i++) {
                String randomAdopter = randomAdopter(adopters);
                adopters.remove(randomAdopter);
//                isThereMatchingPair++;
            }
            for (int i = 0; i < animals.size(); i++) {
                if (animals.get(i).isAdoptable()) {
                    Animal randomAdoptableAnimal = randomAnimal(animals);
                    animals.remove(randomAdoptableAnimal);
//                    isThereMatchingPair++;
                }
//            }
        }
    }

    public int earDonation(int amount) {
        budget += amount;
        return budget;
    }

    public String randomAdopter(ArrayList<String> list) {
        int randomIndex = new Random().nextInt(list.size());
        return list.get(randomIndex);
    }

    public Animal randomAnimal(ArrayList<Animal> list) {
        int randomIndex = new Random().nextInt(list.size());
        return list.get(randomIndex);
    }

    public String toString() {
        String shelterString = "";
        for (Animal animal : animals) {
            shelterString += animal.toString() + "\n";
        }
        return "Budget: " + this.budget + " €," + "\n" + "There are " + animals.size() + " animal(s) and " + adopters.size() + " potential adopter(s)" + "\n" + shelterString.toString();
    }
}

