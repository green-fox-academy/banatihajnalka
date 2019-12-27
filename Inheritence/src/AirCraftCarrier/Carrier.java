package AirCraftCarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
    private List<Aircraft> carrierName;
    private int ammoStorage;
    private int healthPoints;

    public Carrier(int ammoStorage, int healthPoints) {
        this.carrierName = new ArrayList<Aircraft>();
        this.ammoStorage = ammoStorage;
        this.healthPoints = healthPoints;
    }

    public void addAircrafts(Aircraft aircraft) {
        this.carrierName.add(aircraft);
    }

    public void fill() throws NoAmmoExeption {
        if (this.ammoStorage == 0) {
            throw new NoAmmoExeption();
        } else {
            List<Aircraft> needsAmmoPrior = new ArrayList<>();
            List<Aircraft> needsAmmoOthers = new ArrayList<>();
            for (Aircraft aircraft : carrierName) {
                if (aircraft.isPriority()) {
                    needsAmmoPrior.add(aircraft);
                } else {
                    needsAmmoOthers.add(aircraft);
                }
            }
            for (Aircraft aircraft : needsAmmoPrior) {
                divideAmmunition(aircraft);
                if (this.ammoStorage == 0) {
                    break;
                }
            }
            for (Aircraft aircraft : needsAmmoOthers) {
                divideAmmunition(aircraft);
                if (this.ammoStorage == 0) {
                    break;
                }
            }
        }
    }

    private void divideAmmunition(Aircraft aircraft) {
        this.ammoStorage = aircraft.refill(this.ammoStorage);
    }

    public void fight(Carrier anotherCarrier) {
        for (Aircraft aircraft : carrierName) {
            if (anotherCarrier.healthPoints > 0) {
                anotherCarrier.healthPoints -= aircraft.fight();
            } else {
                break;
            }
        }
    }

    public String getStatus() {
        String returnStr = "";
        if (this.healthPoints <= 0) {
            returnStr = "It's dead Jim :(";
        } else {
            returnStr += "HP: " + this.healthPoints + ", Aircraft count: " + this.carrierName.size() +
                    ", Ammo storage: " + this.ammoStorage + ", Total damage: " + totalDamage() + "\nAircrafts:";
            for (Aircraft aircraft : carrierName) {
                returnStr += "\n" + aircraft.getStatus();
            }
        }
        return returnStr;
    }

    public int totalDamage() {
        int totalDamage = 0;
        for (Aircraft aircraft : carrierName) {
            totalDamage += aircraft.getDamage();
        }
        return totalDamage;
    }
}


