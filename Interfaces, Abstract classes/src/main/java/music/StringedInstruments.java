package main.java.music;

public abstract class StringedInstruments extends Instrument {
    private int numberOfStrings;

    int getNumberOfStrings() {
        return numberOfStrings;
    }

    StringedInstruments(int numberOfStrings, String name) {
        super(name);
        this.numberOfStrings = numberOfStrings;
    }

    public abstract void sound();

    @Override
    public void play() {
        System.out.print(this.getClass().getSimpleName() + ", a " + this.getNumberOfStrings() + " stringed instrument that goes ");
        this.sound();
    }
}
