package PirateExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship extends Pirate {
    List<Pirate> listOfPirates;
    int rumAmount;
    Pirate captain;
    int countAlivePirates;

    public Ship() {
        listOfPirates = new ArrayList<>();

    }

    public void fillShip() {
        captain = new Pirate();
        listOfPirates.add(captain);
        int numberOfPirates = new Random().nextInt(10);
        for (int i = 0; i < numberOfPirates; i++) {
            listOfPirates.add(new Pirate());
        }
    }

    public int numberOfAlivePirates() {
        int countAlivePirates = 0;
        for (Pirate pirate : listOfPirates) {
            if (pirate.isAlive()) {
                countAlivePirates++;
            }
        }
        return countAlivePirates;
    }

    public boolean captainIsAlive() {
        return true;
    }

    public String toString() {
       return "Captain has " + rumAmount + " liters of rum, and the captain " + (isAlive() ? "is alive" : "is dead" )+
                ", and the crew has " + numberOfAlivePirates() + " alive pirates.";
    }
}