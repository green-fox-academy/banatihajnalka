package com.greenfoxacademy.covidapi.services;

import com.greenfoxacademy.covidapi.message.request.SignUp;
import com.greenfoxacademy.covidapi.models.ApplicationUser;
import com.greenfoxacademy.covidapi.models.ERole;
import com.greenfoxacademy.covidapi.models.Role;
import com.greenfoxacademy.covidapi.repositories.RoleRepository;
import com.greenfoxacademy.covidapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private PasswordEncoder encoder;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder encoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.encoder = encoder;
    }


    @Override
    public boolean userIsExistsByName(String userName) {
        Optional<ApplicationUser> optionalUser = userRepository.findByUsername(userName);
        return optionalUser.isPresent();
    }

    @Override
    public boolean userIsExistsByEmail(String email) {
        Optional<ApplicationUser> optionalUser = userRepository.findByEmail(email);
        return optionalUser.isPresent();
    }

    @Override
    public void saveRequest(SignUp signUpRequest) {
        ApplicationUser newUser = new ApplicationUser(signUpRequest.getUsername(), signUpRequest.getEmail(), encoder.encode(signUpRequest.getPassword()));
        Set<String> strRoles = signUpRequest.getRole();
        newUser.setRoles(setRoleSet(strRoles));
        userRepository.save(newUser);
    }

    @Override
    public Set<Role> setRoleSet(Set<String> strRoles) {
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
        return roles;
    }
}
