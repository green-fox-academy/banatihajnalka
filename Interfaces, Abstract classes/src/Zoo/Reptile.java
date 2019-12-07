package Zoo;

public class Reptile extends Animal implements AbleToDo {
    private boolean hasSlowMetabolism;
    private boolean isHeatSneaking;

    public Reptile(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Eats insects");
    }

    @Override
    public String  breed() {
        return "from egg or are vivipars.";

    }
}