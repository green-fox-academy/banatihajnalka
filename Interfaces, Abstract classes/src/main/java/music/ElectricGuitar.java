package main.java.music;

public class ElectricGuitar extends StringedInstruments {

    public ElectricGuitar() {
        super(6, "Electric Guitar");
    }
    public ElectricGuitar(int numberOfStrings) {
       super(numberOfStrings, "Electric Guitar");
    }

    @Override
    public void sound() {
        System.out.println("Twang.");
    }
//    @Override
//    public void play() {
//        System.out.print(this.getName() + ", a " + this.getNumberOfStrings() + " stringed instrument that goes ");
//        this.sound();
//    }
}
