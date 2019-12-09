package main.java.music;

public abstract class StringedInstruments extends Instrument {
    protected int numberOfStrings;


    public StringedInstruments() {
    }
    public StringedInstruments(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public abstract void sound();

    @Override
    public void play() {
        System.out.print(this.getClass().getSimpleName() + ", a " + this.numberOfStrings + " stringed instrument that goes ");
        this.sound();
    }
}
