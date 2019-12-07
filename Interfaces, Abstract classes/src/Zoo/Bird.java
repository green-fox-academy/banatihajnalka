package Zoo;

import javax.sound.midi.Soundbank;

public class Bird extends Animal implements AbleToDo {
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
}
