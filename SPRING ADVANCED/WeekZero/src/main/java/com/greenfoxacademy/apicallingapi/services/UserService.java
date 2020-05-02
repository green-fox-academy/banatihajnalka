package com.greenfoxacademy.apicallingapi.services;

import com.greenfoxacademy.apicallingapi.models.UserDTO;

public interface UserService {

    boolean userIsExists(String userName);

    void save(UserDTO userDTO);

    boolean isValidUser(String userName, String password);
}
