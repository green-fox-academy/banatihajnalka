package com.greenfoxacademy.apicallingapi.services;

import com.greenfoxacademy.apicallingapi.models.entities.User;
import com.greenfoxacademy.apicallingapi.models.dtos.UserDTO;
import com.greenfoxacademy.apicallingapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean userIsExistsByName(String userName) {
        Optional<User> optionalUser = userRepository.findByUserName(userName);
        return optionalUser.isPresent();
    }

    @Override
    public boolean userIsExistsByEmail(String email) {
        Optional<User> optionalUser = userRepository.findByEmail(email);
        return optionalUser.isPresent();
    }

    @Override
    public void save(UserDTO userDTO) {
        User newUser = new User(userDTO.getUserName(), userDTO.getPassword(), userDTO.getEmail());
        userRepository.save(newUser);
    }

    @Override
    public boolean isValidUser(String userName, String password) {
        Optional<User> user = userRepository.findByUserName(userName);
        return user.isPresent() && user.get().getPassword().equals(password);
    }

}
