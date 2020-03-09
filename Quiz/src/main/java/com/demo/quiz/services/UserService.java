package com.demo.quiz.services;

import com.demo.quiz.models.entities.User;
import com.demo.quiz.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Iterable<User> findAllUsers() {
        return userRepository.findAll();
    }

    public boolean isExists(String name) {
        if (name == null) {
            return false;
        }
        Optional<User> user = userRepository.findByName(name);
        return user.map(value -> value.getName().equals(name)).orElse(false);
    }

    public Optional<User> find(String name) {
        Optional<User> user = userRepository.findByName(name);
        if (user.isPresent()) {
            if (user.get().getName().equals(name)) {
                return user;
            }
        }
        return Optional.empty();
    }

    public void addUser(User user) {
        userRepository.save(new User());
    }
}



/*
    public boolean isExists(String name) {
        if (name == null) {
            return false;
        }
        return userRepository.findByName(name).equals(name);
    }
    public boolean isExists(String name, String password) {
        if (name == null || password == null) {
            return false;
        }
        return (userRepository.findByName(name).equals(name) && userRepository.findByPassword(password).equals(password));
    }
    public void add(String name, String password) {
        if (!isExists(name, password)) {
            userRepository.save(new User(name, password));
        }
    }
*/


