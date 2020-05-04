package com.greenfoxacademy.apicallingapi.controllers;

import com.greenfoxacademy.apicallingapi.models.ERole;
import com.greenfoxacademy.apicallingapi.models.dtos.UserDTO;
import com.greenfoxacademy.apicallingapi.models.entities.Role;
import com.greenfoxacademy.apicallingapi.payload.JwtResponse;
import com.greenfoxacademy.apicallingapi.payload.LoginRequest;
import com.greenfoxacademy.apicallingapi.payload.MessageResponse;
import com.greenfoxacademy.apicallingapi.payload.SignUpRequest;
import com.greenfoxacademy.apicallingapi.repositories.RoleRepository;
import com.greenfoxacademy.apicallingapi.security.jwt.JwtUtils;
import com.greenfoxacademy.apicallingapi.security.services.UserDetailsImpl;
import com.greenfoxacademy.apicallingapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private AuthenticationManager authenticationManager;
    private RoleRepository roleRepository;
    private UserService userService;
    private PasswordEncoder encoder;
    private JwtUtils jwtUtils;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public AuthController(AuthenticationManager authenticationManager, RoleRepository roleRepository, UserService userService, PasswordEncoder encoder, JwtUtils jwtUtils) {
        this.authenticationManager = authenticationManager;
        this.roleRepository = roleRepository;
        this.userService = userService;
        this.encoder = encoder;
        this.jwtUtils = jwtUtils;
    }

    @PostMapping("register")
    ResponseEntity<String> addUser(@Valid @RequestBody UserDTO user) {
        // persisting the user
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        userService.save(user);
        return ResponseEntity.ok("User is valid");
    }

    @PostMapping("/login")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) throws Exception {
//        try {
//        } catch (BadCredentialsException e) {
//            throw new Exception("Incorrect username or password");
//        }
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtUtils.generateJwtToken(authentication);

        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
        List<String> roles = userDetails.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.toList());

        return ResponseEntity.ok(new JwtResponse(jwt,
                userDetails.getId(),
                userDetails.getUsername(),
                userDetails.getEmail(),
                roles));
    }

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@Valid @RequestBody SignUpRequest signUpRequest) {
        if (userService.userIsExistsByName(signUpRequest.getUsername())) {
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse("Error: Username is already taken!"));
        }

        if (userService.userIsExistsByEmail(signUpRequest.getEmail())) {
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse("Error: Email is already in use!"));
        }

//         Create new user's account
//        User user = new User(signUpRequest.getUsername(),
//                signUpRequest.getPassword(), "USER", signUpRequest.getEmail());

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
//
//        user.setRoles(roles);
//        userService.save(user);

        return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
    }
}
