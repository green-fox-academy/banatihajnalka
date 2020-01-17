package PirateExam;

import java.util.Random;

public class Pirate {

    private int intoxicationLevel;
    private boolean isPassedOut;
    private boolean isAlive;
    private boolean isCaptain;

    public Pirate() {
        this.intoxicationLevel = 0;
        this.isPassedOut = false;
        this.isAlive = true;
        this.isCaptain = false;
    }

    public void drinkSomeRum(int volume) {
        if (this.isAlive) {
            intoxicationLevel++;
        } else {
            System.out.println("He is dead");
        }
    }

    public void howsItGoingMate() {
        if (intoxicationLevel <= 4) {
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
        int chance = new Random().nextInt(3);
        if (anotherPirate.isAlive) {
            if (chance == 0) {
                this.die();
            } else if (chance == 1) {
                anotherPirate.die();
            } else {
                this.die();
                anotherPirate.die();
            }
        }
    }

    public boolean isAlive() {
        return isAlive;
    }

    public int getIntoxicationLevel() {
        return intoxicationLevel;
    }

    public void setIntoxicationLevel(int intoxicationLevel) {
        this.intoxicationLevel = intoxicationLevel;
    }

    public void setCaptain() {
        isCaptain = true;
    }
}
