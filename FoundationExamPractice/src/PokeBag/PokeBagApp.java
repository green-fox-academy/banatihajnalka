package PokeBag;

public class PokeBagApp {

    public static void main(String[] args) {

        PokeBag pokeBag = new PokeBag();

        pokeBag.add(new Pikachu());
        pokeBag.add(new Pikachu());
        pokeBag.add(new Charmander());
        pokeBag.add(new Charmander());
        pokeBag.add(new Bulbasaur());
        pokeBag.add(new Bulbasaur());
        pokeBag.add(new Bulbasaur());

        System.out.println(pokeBag.getStrongest());
        System.out.println(pokeBag.fight());
        System.out.println(pokeBag.fight());
        System.out.println(pokeBag.fight());
        System.out.println(pokeBag.fight());

    }
}
