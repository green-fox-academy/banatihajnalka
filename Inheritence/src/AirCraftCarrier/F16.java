package AirCraftCarrier;

public class F16 extends Aircraft {

    public F16(int ammunition, int maxAmmo, int baseDamage) {
        super();
        this.setMaxAmmo(8);
        this.setBaseDamage(30);
        this.setPriority(false);
    }
}
