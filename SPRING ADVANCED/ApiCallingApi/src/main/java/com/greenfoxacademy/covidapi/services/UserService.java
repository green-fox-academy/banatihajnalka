package com.greenfoxacademy.covidapi.services;

import com.greenfoxacademy.covidapi.message.request.SignUp;
import com.greenfoxacademy.covidapi.models.Role;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface UserService {

    boolean userIsExistsByName(String userName);

    boolean userIsExistsByEmail(String email);

    void saveRequest(SignUp signUpRequest);

    Set<Role> setRoleSet(Set<String> strRoles);

}
