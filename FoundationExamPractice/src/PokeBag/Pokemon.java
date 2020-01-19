package PokeBag;

import java.util.Random;

public abstract class Pokemon {

    private int healthPoint;
    private int strenght;

    Pokemon(int healthPoint) {
        this.healthPoint = healthPoint;
        this.strenght = new Random().nextInt(11);
    }

    void lost() {
        this.setHealthPoint();
    }

    int getStrenght() {
        return strenght;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    private void setHealthPoint() {
        this.healthPoint -= -1;
    }

    public abstract String speak();

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}