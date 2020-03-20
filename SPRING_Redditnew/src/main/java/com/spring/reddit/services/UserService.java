package com.spring.reddit.services;

import com.spring.reddit.models.User;
import com.spring.reddit.repositories.UserRepository;
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

    public boolean isExistsByNameAndPassword(String name, String password) {
        if (userRepository.findByUsername(name).isPresent()) {
            Optional<User> currentUser = userRepository.findByUsername(name);
            return currentUser.get().getPassword().equals(password);
        }
        return false;
    }

    public boolean isExistsByName(String name) {
        return userRepository.findByUsername(name).isPresent();
    }

    public void add(User user) {
        userRepository.save(user);
    }
    }
