package FishTank;

import java.sql.SQLOutput;

public class MainFishTank {

    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();

        aquarium.add(new ClownFish("pityu"));
        aquarium.add(new ClownFish("klau"));
        aquarium.add(new Tang("buci"));
        aquarium.add(new Kong("bela"));

        aquarium.getStatus();
        aquarium.feed();
        aquarium.removeFish();
        aquarium.getStatus();
    }
}
