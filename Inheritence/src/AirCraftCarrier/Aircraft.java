package AirCraftCarrier;

public abstract class Aircraft<abstrac> {

    private int ammunition = 0;
    private int maxAmmo;
    private int baseDamage;
    private int damage;
    private int remainingAmmo;

    public Aircraft(int ammunition) {
    }

   public int fight() {
       for (int i = 0; i < ammunition ; i++) {
           damage = baseDamage * ammunition;
       }
       return damage;
   }

   public int refill(int charge) {
        

        }
   }

}

