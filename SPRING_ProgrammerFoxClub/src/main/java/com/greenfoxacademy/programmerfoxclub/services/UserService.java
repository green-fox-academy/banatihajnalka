package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import com.greenfoxacademy.programmerfoxclub.models.User;
import com.greenfoxacademy.programmerfoxclub.repositories.FoxRepository;
import com.greenfoxacademy.programmerfoxclub.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;
    private FoxService foxService;
    private FoxRepository foxRepository;

    @Autowired
    public UserService(UserRepository userRepository, FoxService foxService, FoxRepository foxRepository) {
        this.userRepository = userRepository;
        this.foxService = foxService;
        this.foxRepository = foxRepository;
    }

    public boolean isExistsByName(String username) {
        Optional<User> user = userRepository.findByUsername(username);
        return user.isPresent();
    }

    public User registerUser(String username, String password, String foxname) {
        User newUser = new User(username, password);
        foxService.add(foxname);
        foxService.find(foxname).setUser(newUser);
        return userRepository.save(newUser);
    }

    public boolean isValidUser(String name, String password) {
        Optional<User> user = userRepository.findByUsername(name);
        return user.isPresent() && user.get().getPassword().equals(password);
    }

    public User findByName(String username) {
        Optional<User> user = userRepository.findByUsername(username);
        return user.orElse(null);
    }

    public Fox findUsersFox(String name) {
        User user = findByName(name);
        Optional<Fox> fox = foxRepository.findByUserUserId(user.getUserId());
        return fox.orElse(null);
    }
}
