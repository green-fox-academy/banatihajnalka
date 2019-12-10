package AirCraftCarrier;

import java.util.List;

public abstract class Aircraft<abstrac> {

    private int ammunition;
    private int maxAmmo;
    private int baseDamage;
    private int damage;
    private boolean isPriority;

    public Aircraft() {
        ammunition = 0;
    }

   public int fight() {
        damage = baseDamage * ammunition;
        this.ammunition = 0;
        return damage;
   }

   public int refill(int charge) {
        int remainingAmmo = charge - (maxAmmo - ammunition);
        ammunition = maxAmmo;
        setDamage(ammunition * baseDamage);
        return remainingAmmo;
   }

   public String getType() {
        return this.getClass().getSimpleName();
   }

   public String getStatus() {
        return "Type " + getType() + ", Ammo:" + getAmmunition() + ", Base Damage:" + getBaseDamage() +
                ", All Damage:" + getDamage();
   }

    public int getAmmunition() {
        return ammunition;
    }
    public void setAmmunition(int ammunition) {
        if (ammunition > maxAmmo) return;
        this.ammunition = ammunition;
    }

    public int getMaxAmmo() {
        return maxAmmo;
    }
    public void setMaxAmmo(int maxAmmo) {
        this.maxAmmo = maxAmmo;
    }

    public int getBaseDamage() {
        return baseDamage;
    }
    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }

    public boolean isPriority() {
        return isPriority;
    }
    public void setPriority(boolean priority) {
        isPriority = priority;
    }
}

