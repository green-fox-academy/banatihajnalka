package main.java.music;

public class Violin extends StringedInstruments {

    public Violin() {
        super(4, "Violin");
    }
    public Violin(int numberOfStrings) {
        super(numberOfStrings, "Violin");
    }

    @Override
    public void sound() {
        System.out.println("Screech.");
    }
//    @Override
//    public void play() {
//        System.out.print(this.getName() + ", a " + this.getNumberOfStrings() + " stringed instrument that goes ");
//        this.sound();
//    }
}
