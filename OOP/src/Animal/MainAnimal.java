package Animal;

public class MainAnimal {
    public static void main(String[] args) {

        Animal horse = new Animal();
        System.out.println(horse.hunger);
        horse.eat();
        System.out.println(horse.hunger);

        Animal pig = new Animal();
        System.out.println(pig.thirstValue);
        pig.play();
        System.out.println(pig.thirstValue);
    }
}
