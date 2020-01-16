package PirateExam;

import java.util.Random;

public class Pirate {

    private int intoxicationLevel;
    private boolean isPassedOut;
    private boolean isAlive;

    public Pirate() {
        this.intoxicationLevel = 0;
        this.isPassedOut = false;
        this.isAlive = true;
    }

    public void drinkSomeRum() {
        if (this.isAlive) {
            intoxicationLevel++;
        } else {
            System.out.println("He is dead");
        }
    }

    public void howsItGoingMate() {
        if (intoxicationLevel >= 4) {
            System.out.println("Pour me anudder!");
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            this.isPassedOut = true;
        }
    }

    public void die() {
        this.isAlive = false;
    }

    public void brawl(Pirate anotherPirate) {
        int chance = new Random().nextInt(4);
        if (anotherPirate.isAlive) {
            if (chance >= 0 && chance <= 1) {
                this.die();
            } else if (chance >= 1 && chance <= 2) {
                anotherPirate.die();
            } else {
                this.die();
                anotherPirate.die();
            }
        }
    }
}
