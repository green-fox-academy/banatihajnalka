package com.greenfoxacademy.apicallingapi.services;

import com.greenfoxacademy.apicallingapi.models.dtos.UserDTO;
import com.greenfoxacademy.apicallingapi.models.entities.Role;
import com.greenfoxacademy.apicallingapi.payload.SignUpRequest;

import java.util.Set;

public interface UserService {

    boolean userIsExistsByName(String userName);

    boolean userIsExistsByEmail(String email);

    boolean arePasswordsMatching(String password, String matchingPassword);

    void save(UserDTO userDTO);

    boolean isValidUser(String userName, String password);

    void saveRequest(SignUpRequest signUpRequest);

    Set<Role> setRoleSet(Set<String> strRoles);
}
