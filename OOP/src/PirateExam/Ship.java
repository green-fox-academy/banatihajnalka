package PirateExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship extends Pirate {
    List<Pirate> listOfPirates;
    int rumAmount;
    Pirate captain;
    int numberOfAlivePirates;
    int numberOfConsumedPirates;

    public Ship() {
        listOfPirates = new ArrayList<>();

    }

    public void fillShip() {
        captain = new Pirate();
        listOfPirates.add(captain);
        int numberOfPirates = randomNumber();
        for (int i = 0; i < numberOfPirates; i++) {
            listOfPirates.add(new Pirate());
        }
    }

    public boolean battle(Ship otherShip) {
        if (this.score() > otherShip.score()) {
            this.party();
            return true;
        } else {
            for (int i = 0; i < randomNumber(); i++) {
                otherShip.lost();
            }
            return false;
        }
    }

    public int score() {
        return numberOfAlivePirates - captain.getIntoxicationLevel();
    }

    public void lost() {
        for (int i = 0; i < this.listOfPirates.size() - randomNumber(); i++) {
            this.listOfPirates.get(i).die();
        }
    }

    private void party() {
        this.captain.setIntoxicationLevel(randomNumber());
        for (Pirate pirate : listOfPirates) {
            pirate.setIntoxicationLevel(randomNumber());
        }
    }

    public int randomNumber() {
        return new Random().nextInt(15);
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

    public int numberOfConsumedPirates() {
        int countConsumedPirates = 0;
        for (Pirate pirate : listOfPirates) {
            if (pirate.isAlive()) {
                countConsumedPirates++;
            }
        }
        return countConsumedPirates;
    }

    public String toString() {
        return "Captain has " + rumAmount + " liters of rum, and the captain " + (isAlive() ? "is alive" : "is dead") +
                ", and the crew has " + numberOfAlivePirates() + " alive pirates.";
    }
}