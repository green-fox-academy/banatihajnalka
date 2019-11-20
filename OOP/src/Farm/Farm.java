package Farm;

import java.util.*;

public class Farm {
    public List<Animal> listOfAnimals;
    int initialCapacity = 50;
    int actualCapacity = 0;

    public Farm() {
        this.listOfAnimals = new ArrayList<>();
    }

    public String randomAnimal() {
        List<String> typeOfAnimals = Arrays.asList("dog", "horse", "rabbit", "cat", "chichken");
        Random random = new Random();
        String randomAnimal =typeOfAnimals.get(random.nextInt(typeOfAnimals.size()));
        return randomAnimal;
    }

    public int breed() {
        int actualCapacity = listOfAnimals.size();
            if (actualCapacity < initialCapacity) {
                Animal randomAnimal = new Animal(randomAnimal());
                listOfAnimals.add(randomAnimal);
                actualCapacity -= 1;
            } return actualCapacity;
        }

        public int slaughter() {
            int minHunger = listOfAnimals.get(0).hunger;
            int indexHunger = 0;
            for (int i = 0; i < listOfAnimals.size(); i++) {
                if (listOfAnimals.get(i).hunger < minHunger) {
                    indexHunger = i;
                    minHunger = listOfAnimals.get(i).hunger;
                }
            } listOfAnimals.remove(indexHunger);
            return indexHunger;
        }
}



