package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Service
public class FoxService {

    private ArrayList<Fox> foxes;
    private String foodChange;
    private String drinkChange;
    private String trickChange;

    public FoxService() {
        foxes = new ArrayList<>();
        foxes.add(new Fox("Karak", "meat", "water"));
        foxes.add(new Fox("Vuk"));
        foxes.add(new Fox("Csele"));
    }

    public ArrayList<Fox> findAll() {
        return foxes;
    }

    public boolean isExists(String name) {
        if (name == null) {
            return false;
        }
        for (Fox fox : foxes) {
            if (fox.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void add(String name) {
        if (!isExists(name)) {
            foxes.add(new Fox(name));
        }
    }

    public Fox find(String name) {
        for (Fox fox : foxes) {
            if (fox.getName().equals(name)) {
                return fox;
            }
        }
        return null;
    }
    
    public void feedAndRecordChanges(String name, String food) {
        foodChange = LocalDateTime.now() + ": Food has been changed from: " + find(name).getFood() + " to " + food.toLowerCase();
        find(name).setFood(food.toLowerCase());
    }

    public void drinkAndRecordChanges(String name, String drink) {
        drinkChange = LocalDateTime.now() + ": Drink has been changed from: " + find(name).getDrink() + " to " + drink.toLowerCase();
        find(name).setDrink(drink.toLowerCase());
    }

    public void addTrickAndRecordChanges(String name, String trick) {
        trickChange = LocalDateTime.now() + ": Learned to: " + find(name).getTricks() + " to " + trick.toLowerCase();
        find(name).setTricks(trick.toLowerCase());
    }

    public String getTrickChange() {
        return trickChange;
    }

    public void setTrickChange(String trickChange) {
        this.trickChange = trickChange;
    }

    public String getFoodChange() {
        return foodChange;
    }

    public void setFoodChange(String foodChange) {
        this.foodChange = foodChange;
    }

    public String getDrinkChange() {
        return drinkChange;
    }

    public void setDrinkChange(String drinkChange) {
        this.drinkChange = drinkChange;
    }
}



