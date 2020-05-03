package com.greenfoxacademy.apicallingapi.services;

import com.greenfoxacademy.apicallingapi.models.dtos.UserDTO;

public interface UserService {

    boolean userIsExistsByName(String userName);

    boolean userIsExistsByEmail(String email);

    void save(UserDTO userDTO);

    boolean isValidUser(String userName, String password);

}
