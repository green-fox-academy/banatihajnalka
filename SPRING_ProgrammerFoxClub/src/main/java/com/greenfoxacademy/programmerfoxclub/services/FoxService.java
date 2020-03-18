package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import com.greenfoxacademy.programmerfoxclub.models.Trick;
import com.greenfoxacademy.programmerfoxclub.repositories.FoxRepository;
import com.greenfoxacademy.programmerfoxclub.repositories.TrickRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FoxService {

    private TrickRepository trickRepository;
    private FoxRepository foxRepository;

    @Autowired
    public FoxService(TrickRepository trickRepository, FoxRepository foxRepository) {
        this.trickRepository = trickRepository;
        this.foxRepository = foxRepository;
    }

//    private ArrayList<Fox> foxes;

    public FoxService() {
//        foxes = new ArrayList<>();

    }

//    public List<Fox> findAll() {
//        return foxRepository.findAll();
//    }

    public boolean isExists(String name) {
        if (name == null) {
            return false;
        }
        for (Fox fox : foxRepository.findAll()) {
            if (fox.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void add(String name) {
        if (!isExists(name)) {
            foxRepository.save(new Fox(name));
        }
    }

    public Fox find(String name) {
        for (Fox fox : foxRepository.findAll()) {
            if (fox.getName().equals(name)) {
                return fox;
            }
        }
        return null;
    }

    public String date() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy. MMMM dd. HH:mm:ss");
        return now.format(formatter);
    }

    public void feedAndRecordChanges(String name, String food) {
        String foodChange = date() + ": Food has been changed from: " + find(name).getFood() + " to " + food.toLowerCase();
        find(name).addAction(foodChange);
        find(name).setFood(food.toLowerCase());
    }

    public void drinkAndRecordChanges(String name, String drink) {
        String drinkChange = date() + ": Drink has been changed from: " + find(name).getDrink() + " to " + drink.toLowerCase();
        find(name).addAction(drinkChange);
        find(name).setDrink(drink.toLowerCase());
    }

    public void addTrickAndRecordChanges(String name, String trick) {
        String trickChange = date() + ": Learned to: " + trick.toLowerCase();
        find(name).addAction(trickChange);
        find(name).setTricks(findTrickByName(trick));
    }

    public Trick findTrickByName(String trickName) {
        Optional<Trick> trick = trickRepository.findByTrick(trickName);
        return trick.orElse(null);
    }

    public List<Trick> getNotKnownTricks(Fox fox) {
        List<Trick> notKnownTricks = trickRepository.findAll();
        List<Trick> foxTricks = new ArrayList<>();
        if (fox.getTricks() != null) {
            foxTricks.add((Trick) fox.getTricks());
        }
        notKnownTricks.removeAll(foxTricks);
        return notKnownTricks;
    }


//    public int knowsAll() {
//      return notKnownTricks.size();
//    }

    //    public List<String> getNotKnownTricks() {
//        return notKnownTricks;
//    }


}



