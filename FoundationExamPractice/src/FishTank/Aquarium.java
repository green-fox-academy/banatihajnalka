package FishTank;

import java.util.ArrayList;

public class Aquarium {

    ArrayList<Fish> aquarium;

    public Aquarium() {
        aquarium = new ArrayList<>();
    }

    public void add(Fish fish) {
        aquarium.add(fish);
    }

    public void feed() {
        for (Fish fish : aquarium) {
            fish.feed();
        }
    }

    public void removeFish() {
        for (int i = 0; i < aquarium.size(); i++) {
            if (aquarium.get(i).getWeight() > 11) {
                aquarium.remove(aquarium.get(i));
            }
        }
    }

    public void getStatus() {
        for (Fish fish : aquarium) {
            fish.status();
        }
    }
}
