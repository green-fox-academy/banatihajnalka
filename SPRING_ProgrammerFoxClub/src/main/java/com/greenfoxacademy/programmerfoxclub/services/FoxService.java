package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.modles.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FoxService {

    private ArrayList<Fox> foxes;

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

}



