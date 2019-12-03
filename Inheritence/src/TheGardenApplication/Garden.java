package TheGardenApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow;

public class Garden extends Plant {
    private List<Plant> plants;


    public Garden(String name) {
        super();
        plants = new ArrayList<>();
    }

    public void addPlants(Plant plant) {
        plants.add(plant);
    }

    }

}
