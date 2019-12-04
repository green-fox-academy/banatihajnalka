package TheGardenApplication;

public class MainGardening {

    public static void main(String[] args) {

        Garden garden = new Garden("garden");
        garden.addPlants(new TheFlower("yellow", 0));
        garden.addPlants(new TheFlower("blue", 0));
        garden.addPlants(new TheTree("purple", 0));
        garden.addPlants(new TheTree("orange", 0));

        garden.needsWater();
        garden.watering(40);
        garden.needsWater();
        garden.watering(70);
        garden.needsWater();
    }
}
