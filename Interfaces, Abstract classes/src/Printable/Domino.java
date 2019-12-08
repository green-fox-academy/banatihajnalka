package Printable;

public class Domino implements Printable {
    private int sideA;
    private int sideB;

    public Domino() {
    }
    public Domino(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }
    public int getSideB() {
        return sideB;
    }

    @Override
    public void printAllFields() {
        System.out.println("Domino A side : " + this.sideA + ", B side : " + this.sideB);
    }
}
