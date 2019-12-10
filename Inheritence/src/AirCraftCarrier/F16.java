package AirCraftCarrier;

public class F16 extends Aircraft {

    public F16(int ammunition, int maxAmmo, int baseDamage) {
        super(ammunition);
        maxAmmo = 8;
        baseDamage = 30;
    }
}
