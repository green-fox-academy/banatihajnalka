package com.greenfoxacademy.programmerfoxclub.modles;

import java.util.ArrayList;
import java.util.List;

public class Fox {

    private String name;
    private List<String> tricks;
    private int numberOfTricks;
    private String food;
    private String drink;

    public Fox() {
    }

    public Fox(String name) {
        this.name = name;
        tricks = new ArrayList<>();
    }

    public Fox(String name, String food, String drink) {
        this.name = name;
        this.food = food;
        this.drink = drink;
        tricks = new ArrayList<>();
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

    public void setTricks(List<String> tricks) {
        this.tricks = tricks;
    }

    public int numberOfTricks() {
        if (tricks.isEmpty()) {
            return 0;
        }
        int numberOfTricks = 0;
        for (int i = 0; i < tricks.size(); i++) {
            numberOfTricks++;
        }
        return numberOfTricks;
    }

    public int getNumberOfTricks() {
        return numberOfTricks;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    @Override
    public String toString() {
            return "This is " + name + ". Currently living on " + food + " and " + drink + " He knows " + numberOfTricks() + ".";
    }
}
