package PiratesTrial;

import java.util.ArrayList;
import java.util.List;

public class Ship {

    public List<Pirate> pirateList;
    Pirate captain = new Pirate();

    public Ship() {
        this.pirateList = new ArrayList<>();
    }

    public void addPirates() {
        this.captain = new Pirate();
        this.pirateList = new ArrayList<>();
        for (int i = 0; i < (int) (Math.random() * 50); i++) {
            this.pirateList.add(new Pirate());
        }
    }

    public List<String> getPoorPirates() {
        List<String> poorPirates = new ArrayList<>();
        for (int i = 0; i < pirateList.size(); i++) {
            if (pirateList.get(i).hasWoodenLeg && pirateList.get(i).amountOfGold < 15) {
                poorPirates.add(pirateList.get(i).name);
            }
        }
        return poorPirates;

    }
}

