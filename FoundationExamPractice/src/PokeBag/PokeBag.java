package PokeBag;

import java.util.*;

public class PokeBag {
    ArrayList<Pokemon> listOfPokemons;

    public PokeBag() {
        listOfPokemons = new ArrayList<Pokemon>();
    }

    public void add(Pokemon pokemon) {
        listOfPokemons.add(pokemon);
    }

    public Pokemon getStrongest() {
        HashMap<Pokemon, Integer> strengtMap = new HashMap<Pokemon, Integer>();
        for (Pokemon pokemon : listOfPokemons) {
            strengtMap.put(pokemon, pokemon.getStrenght());
        }
        Pokemon strongest = Collections.max(strengtMap.entrySet(), Map.Entry.comparingByValue()).getKey();
        return strongest;
    }

    public String fight() {
        int first = random();
        int second = random();
        int random = new Random().nextInt(1);
        while (first == second) {
            second = random();
        }
        Pokemon fighter = listOfPokemons.get(first);
        Pokemon defender = listOfPokemons.get(second);
        if (fighter.getHealthPoint() > 1 && defender.getHealthPoint() > 1) {
            if (fighter.getStrenght() > defender.getStrenght()) {
                defender.lost();
                return fighter.speak();
            } else if (fighter.getStrenght() < defender.getStrenght()) {
                fighter.lost();
                return defender.speak();
            } else {
                if (random == 0) {
                    defender.lost();
                    return fighter.speak();
                } else {
                    fighter.lost();
                    return defender.speak();
                }
            }
        }
        return "One of them has less then 1 HP";
    }


    public int random() {
        return (int) (Math.random() * listOfPokemons.size());
    }
}
