package Farm;
//Create an Animal class
//Every animal has a hunger value, which is a whole number
//                Every animal has a thirst value, which is a whole number
//                when creating a new animal object these values are created with the default 50 value
//        Every animal can eat() which decreases their hunger by one
//        Every animal can drink() which decreases their thirst by one
//        Every animal can play() which increases both by one

public class Animal {
    Integer hunger;
    Integer thirstValue;
    String name;

    public Animal(String name) {
        this.hunger = 50;
        this.thirstValue = 50;
        this.name = name;
    }

    public Animal(Integer hunger, Integer thirstValue) {
        this.hunger = hunger;
        this.thirstValue = thirstValue;
    }

    public int eat() {
        this.hunger--;
        return hunger;
    }

    public int drink() {
        this.thirstValue--;
        return thirstValue;
    }

    public int play() {
        this.hunger++;
        this.thirstValue++;
        return hunger + thirstValue;

    }

    @Override
    public String toString() {
        String result = "";
        return name;
    }
}
