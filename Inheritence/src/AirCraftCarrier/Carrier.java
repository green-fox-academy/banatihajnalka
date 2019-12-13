package AirCraftCarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
    private List<Aircraft> carrierName;
    private int ammoStorage;
    private int healthPoints;


    public Carrier(int ammo, int healthPoints) {
        this.carrierName = new ArrayList<Aircraft>();
        this.ammoStorage = ammo;
        this.healthPoints = healthPoints;
    }

    public void addAircrafts(Aircraft aircraft) {
        this.carrierName.add(aircraft);
    }

    public void fill() throws NoAmmoExeption {
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
            if (this.ammoStorage < aircraft.getMaxAmmo() - aircraft.getAmmunition()) {
                aircraft.setAmmunition(aircraft.getAmmunition() + this.ammoStorage);
                this.ammoStorage = 0;
                throw new NoAmmoExeption();
            } else {
                this.ammoStorage -= aircraft.getMaxAmmo() - aircraft.getAmmunition();
                aircraft.setAmmunition(aircraft.getMaxAmmo());
            }
        }
        for (Aircraft aircraft : needsAmmoOthers) {
            if (this.ammoStorage < aircraft.getMaxAmmo() - aircraft.getAmmunition()) {
                aircraft.setAmmunition(aircraft.getAmmunition() + this.ammoStorage);
                this.ammoStorage = 0;
                throw new NoAmmoExeption();
            } else {
                this.ammoStorage -= aircraft.getMaxAmmo() - aircraft.getAmmunition();
                aircraft.setAmmunition(aircraft.getMaxAmmo());
            }
        }
    }
}
