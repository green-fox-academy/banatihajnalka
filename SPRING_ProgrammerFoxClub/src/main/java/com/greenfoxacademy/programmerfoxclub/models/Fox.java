package com.greenfoxacademy.programmerfoxclub.models;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fox {

    private String name;
    private List<String> tricks;
    private String food;
    private String drink;
    private List<String> actions;
    List<String> notKnownTricks;

    public Fox() {
    }

    public Fox(String name) {
        this.name = name;
        this.food = "nothing";
        this.drink = "nothing";
        tricks = new ArrayList<>();
        actions = new ArrayList<>();
        notKnownTricks = notKnownTricks();
    }

    public Fox(String name, String food, String drink) {
        this.name = name;
        this.food = food;
        this.drink = drink;
        tricks = new ArrayList<>();
        actions = new ArrayList<>();
        notKnownTricks = notKnownTricks();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTricks() {
        return tricks;
    }

    public void setTricks(String trick) {
        if (!tricks.contains(trick)) {
            tricks.add(trick);
            for (int i = 0; i < notKnownTricks.size(); i++) {
                if (notKnownTricks.get(i).toLowerCase().equals(trick)) {
                    notKnownTricks.remove(i);
                }
            }
        }
    }

    public int numberOfTricks() {
        if (tricks.isEmpty()) {
            return 0;
        } else {
            return tricks.size();
        }
    }

    public int numberOfActions() {
        if (actions.isEmpty()) {
            return 0;
        } else {
            return actions.size();
        }
    }

    public List<String> notKnownTricks() {
        return Stream.of(Tricks.values())
                .map(Tricks::name)
                .collect(Collectors.toList());
    }

    public int knowsAll() {
      return notKnownTricks.size();
    }


//    public boolean isAllTricksAreKnown() {
//        return notKnownTricks.containsAll(tricks);
//    }


    public String getFood() {
        if (food == null) {
            return "nothing";
        }
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        if (drink == null) {
            return "nothing";
        }
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public boolean isActionListIsEmpty() {
        return actions.isEmpty();
    }


    public List<String> getActions() {
        return actions;
    }

    public List<String> getLatestFiveActions() {
        return actions.stream().sorted(Comparator.reverseOrder()).limit(5).collect(Collectors.toList());
    }

    public void addAction(String action) {
        actions.add(action);
    }

    public List<String> getNotKnownTricks() {
        return notKnownTricks;
    }

    @Override
    public String toString() {
        return "This is " + name + ". Currently living on " + food + " and " + drink + ". He knows " + numberOfTricks() + " tricks.";
    }
}
