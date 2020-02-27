package com.greenfoxacademy.programmerfoxclub.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fox {

    private String name;
    private List<String> tricks;
    private String food;
    private String drink;
    private List<String> actions;

    public Fox() {
    }

    public Fox(String name) {
        this.name = name;
        this.food = "nothing";
        this.drink = "nothing";
        tricks = new ArrayList<>();
        actions = new ArrayList<>();
    }

    public Fox(String name, String food, String drink) {
        this.name = name;
        this.food = food;
        this.drink = drink;
        tricks = new ArrayList<>();
        actions = new ArrayList<>();
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

    public boolean knowsAllTricks(){
        return tricks.size() == Tricks.values().length;
    }

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


    @Override
    public String toString() {
        return "This is " + name + ". Currently living on " + food + " and " + drink + ". He knows " + numberOfTricks() + " tricks.";
    }
}
