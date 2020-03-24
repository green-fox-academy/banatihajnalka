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

    public boolean isExistsByUserNameAndPassword(String userName, String password) {
        if (userRepository.findUserByUserName(userName).isPresent()) {
            Optional<User> currentUser = userRepository.findUserByUserName(userName);
            if (currentUser.isPresent()) {
                return currentUser.get().getPassword().equals(password);
            }
        }
        return false;
    }

    public boolean isExistsByName(String userName) {
        return userRepository.findUserByUserName(userName).isPresent();
    }

    public boolean isExistsByUserId(Long userID) {
        return userRepository.findUserByUserId(userID).isPresent();
    }

    public void add(User user) {
        userRepository.save(user);
    }

    public User findUserByName(String userName) {
        Optional<User> user = userRepository.findUserByUserName(userName);
        return user.orElse(null);
    }

    public String getLoginPath(String userName, String password) {
        if (isExistsByUserNameAndPassword(userName, password)) {
            return "redirect:/" + findUserByName(userName).getUserId();
        } else {
            return "redirect:/login";
        }
    }

    public User findUserById(Long userId) {
        Optional<User> user = userRepository.findUserByUserId(userId);
        return user.orElse(null);
    }


}
