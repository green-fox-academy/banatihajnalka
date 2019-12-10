package AirCraftCarrier;

public class NoAmmoExeption extends Exception {
        public NoAmmoExeption() {
            super("Ran out of ammo, cannot fill");
    }
}
