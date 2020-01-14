package AnimalProtection;

public class Main {

    public static void main(String[] args) {

        AnimalShelter kucko = new AnimalShelter();
        Animal animal = new Animal();

        kucko.rescue(new Dog(false));
        kucko.rescue(new Cat(false));
        kucko.rescue(new Parrot(true));

        kucko.addAdopter("jozsi");
        kucko.addAdopter("marika");

        System.out.println(kucko);

        kucko.findNewOwner();

        System.out.println(kucko);

        kucko.heal();

        System.out.println(kucko);

    }
}
