package Zoo;

public class Mammal extends Animal implements AbleToDo {
    private boolean hasNips;
    private boolean hasHair;

    public Mammal(){
    }
    public Mammal(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Eats with mouth.");
    }

    @Override
    public String breed() {
       return "uterus.";
    }
}
