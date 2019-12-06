package main.java.music;

public class BassGuitar extends StringedInstruments {

    public BassGuitar() {
        super(4, "BassGuitar");
    }
    public BassGuitar(int numberOfStrings) {
        super(numberOfStrings, "BassGuitar");
    }

    @Override
    public void sound() {
        System.out.println("Duum-duum-duum.");
    }
    @Override
    public void play() {
        System.out.print(this.getName() + ", a " + this.getNumberOfStrings() + " stringed instrument that goes ");
        this.sound();
    }
}
