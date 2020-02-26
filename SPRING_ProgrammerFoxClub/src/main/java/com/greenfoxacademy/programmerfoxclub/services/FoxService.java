package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

@Service
public class FoxService {

    private ArrayList<Fox> foxes;

    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy. MMMM dd. HH:mm:ss");
    String formatDateTime = now.format(formatter);

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
        String foodChange = formatDateTime + ": Food has been changed from: " + find(name).getFood() + " to " + food.toLowerCase();
        find(name).addAction(foodChange);
        find(name).setFood(food.toLowerCase());
    }

    public void drinkAndRecordChanges(String name, String drink) {
        String drinkChange = formatDateTime + ": Drink has been changed from: " + find(name).getDrink() + " to " + drink.toLowerCase();
        find(name).addAction(drinkChange);
        find(name).setDrink(drink.toLowerCase());
    }

    public void addTrickAndRecordChanges(String name, String trick) {
        String trickChange = formatDateTime + ": Learned to: " + trick.toLowerCase();
        find(name).addAction(trickChange);
        find(name).setTricks(trick.toLowerCase());
    }
}



