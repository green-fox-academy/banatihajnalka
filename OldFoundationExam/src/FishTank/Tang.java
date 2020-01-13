package FishTank;

public class Tang extends Fish {

    private boolean hasShortTermMemLoss;

    public Tang(String name, int weight) {
        super(name, weight, "orange");
        this.hasShortTermMemLoss = true;
    }

    @Override
    public void  status() {
        System.out.println(this.getName() + " , weight: " + this.getWeight() + " , color: " + this.getColor() + " with " + hasShortTermMemLoss + " short-term memory loss");
    }

    @Override
    public void feed() {
        setWeight(getWeight() + 1);
    }
}
