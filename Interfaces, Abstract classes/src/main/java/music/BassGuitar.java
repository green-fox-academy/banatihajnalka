package main.java.music;

public class BassGuitar extends StringedInstruments {

    public BassGuitar() {
        this.numberOfStrings = 4;
    }
    public BassGuitar(int numberOfStrings) {
        super(numberOfStrings);
    }

    @Override
    public void sound() {
        System.out.println("Duum-duum-duum.");
    }
//    @Override
//    public void play() {
//        System.out.print(this.getName() + ", a " + this.getNumberOfStrings() + " stringed instrument that goes ");
//        this.sound();
//    }
}
