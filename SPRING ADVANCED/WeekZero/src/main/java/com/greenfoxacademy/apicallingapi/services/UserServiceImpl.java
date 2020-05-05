package com.greenfoxacademy.apicallingapi.services;

import com.greenfoxacademy.apicallingapi.models.ERole;
import com.greenfoxacademy.apicallingapi.models.entities.Role;
import com.greenfoxacademy.apicallingapi.models.entities.User;
import com.greenfoxacademy.apicallingapi.models.dtos.UserDTO;
import com.greenfoxacademy.apicallingapi.payload.SignUpRequest;
import com.greenfoxacademy.apicallingapi.repositories.RoleRepository;
import com.greenfoxacademy.apicallingapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private RoleRepository roleRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
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
    public boolean arePasswordsMatching(String password, String matchingPassword) {
        return password.equals(matchingPassword);
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

    @Override
    public void saveRequest(SignUpRequest signUpRequest) {
        User newUser = new User(signUpRequest.getUsername(), signUpRequest.getPassword(), signUpRequest.getEmail());
        Set<String> strRoles = signUpRequest.getRole();
        Set<Role> roles = new HashSet<>();
        if (strRoles == null) {
            Role userRole = roleRepository.findByName(ERole.ROLE_USER)
                    .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
            roles.add(userRole);
        } else {
            strRoles.forEach(role -> {
                if ("admin".equals(role)) {
                    Role adminRole = roleRepository.findByName(ERole.ROLE_ADMIN)
                            .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
                    roles.add(adminRole);
                } else {
                    Role userRole = roleRepository.findByName(ERole.ROLE_USER)
                            .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
                    roles.add(userRole);
                }
            });
        }
        newUser.setRoles(roles);
        userRepository.save(newUser);
    }

//    setrole

}
