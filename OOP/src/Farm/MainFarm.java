package Farm;
//#### Farm
//- Reuse your `Animal` class
//- Create a `Farm` class
//  - it has list of Animals
//          - it has slots which defines the number of free places for animals
//          - breed() -> creates a new animal if there's place for it
//          - slaughter() -> removes the least hungry animal

import java.util.Arrays;

public class MainFarm {

    public static void main(String[] args) {
        Farm animals = new Farm();

        animals.breed();
        animals.breed();
        animals.breed();

        System.out.println(animals.listOfAnimals.toString());
        System.out.println(animals.listOfAnimals.get(0).hunger);

        animals.listOfAnimals.get(2).eat();
        animals.slaughter();
        System.out.println(animals.listOfAnimals.toString());




    }


}
