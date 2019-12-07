package Zoo;

import Flyable.Flyable;

import javax.sound.midi.Soundbank;

public class Bird extends Animal implements AbleToDo, Flyable {
    private boolean isFlying;
    private boolean hasFeathers;

    public Bird(){
    }
    public Bird(String name) {
        super(name);
    }


    @Override
    public void eat() {
        System.out.println("Eats with beak.");
    }

    @Override
    public String breed() {
         return "laying eggs.";
    }

    @Override
    public void land() {
        System.out.println("Reach the land with legs, wings closing.");
    }

    @Override
    public void fly() {
        System.out.println("Moves wings");
    }

    @Override
    public void takeOff() {
        System.out.println("Get velocity and opens wings");
    }
}
