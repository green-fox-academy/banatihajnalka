package FishTank;

import java.util.ArrayList;

public class Aquarium {
    ArrayList<Fish> aquarium;

    public Aquarium() {
        this.aquarium = new ArrayList<>();
    }

    public void addFish(Fish fish) {
        this.aquarium.add(fish);
    }

    public void removeFish(){
        for (int i = 0; i < aquarium.size() ; i++) {
            if (aquarium.get(i).getWeight() >= 11) {
                aquarium.remove(i);
            }
        }
    }

    public void feedAllFish() {
        for (Fish fish : aquarium) {
            fish.feed();
        }
    }

    public void  getStatus() {
        for (Fish fish : aquarium) {
            fish.status();
        }
    }
}
