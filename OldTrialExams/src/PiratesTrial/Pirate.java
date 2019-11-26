package PiratesTrial;

public class Pirate {
    String name;
    int amountOfGold;
    int healthPoints;
    boolean isCaptain;
    boolean hasWoodenLeg;

    public Pirate() {
        this.healthPoints = 10;
    }
    public int workAsCaptain() {
        this.amountOfGold += 10;
        this.healthPoints -= 5;
        return amountOfGold + healthPoints;
    }
    public int partyAsCaptain() {
        this.healthPoints += 10;
        return healthPoints;
    }
    public int workAsPirate() {
        this.amountOfGold += 1;
        this.healthPoints -= 1;
        return amountOfGold + healthPoints;
    }
    public int partyAsPirate() {
        this.healthPoints += 1;
        return healthPoints;
    }
    @Override
    public String toString() {
        if (hasWoodenLeg) {
            return "Hello, I'm " + this.name + " . A have a wooden leg and " + this.amountOfGold + "golds.";
        } else {
            return "Hello, I'm " + this.name + " . I still have my real legs and " + this.amountOfGold + " golds.";
        }
    }

}
