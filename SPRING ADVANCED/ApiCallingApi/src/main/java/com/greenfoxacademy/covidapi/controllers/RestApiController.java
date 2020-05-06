package com.greenfoxacademy.covidapi.controllers;

import com.greenfoxacademy.covidapi.message.request.Login;
import com.greenfoxacademy.covidapi.message.request.SignUp;
import com.greenfoxacademy.covidapi.message.response.Token;
import com.greenfoxacademy.covidapi.models.ApplicationUser;
import com.greenfoxacademy.covidapi.models.ERole;
import com.greenfoxacademy.covidapi.models.Role;
import com.greenfoxacademy.covidapi.repositories.RoleRepository;
import com.greenfoxacademy.covidapi.repositories.UserRepository;
import com.greenfoxacademy.covidapi.security.jwt.JwtProvider;
import com.greenfoxacademy.covidapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/auth")
public class RestApiController {


    private AuthenticationManager authenticationManager;
    private UserService userService;
    private JwtProvider jwtProvider;

    @Autowired
    public RestApiController(AuthenticationManager authenticationManager, UserService userService, JwtProvider jwtProvider) {
        this.authenticationManager = authenticationManager;
        this.userService = userService;
        this.jwtProvider = jwtProvider;
    }

    @PostMapping("/signin")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody Login loginRequest) {

        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginRequest.getUsername(),
                        loginRequest.getPassword()
                )
        );

        SecurityContextHolder.getContext().setAuthentication(authentication);

        String jwt = jwtProvider.generateJwtToken(authentication);
        return ResponseEntity.ok(new Token(jwt));
    }

    @PostMapping("/signup")
    public ResponseEntity<String> registerUser(@Valid @RequestBody SignUp signUpRequest) {
        if (userService.userIsExistsByName(signUpRequest.getUsername())) {
            return new ResponseEntity<String>("Fail -> Username is already taken!",
                    HttpStatus.BAD_REQUEST);
        }

        if (userService.userIsExistsByEmail(signUpRequest.getEmail())) {
            return new ResponseEntity<String>("Fail -> Email is already in use!",
                    HttpStatus.BAD_REQUEST);
        }

        userService.saveRequest(signUpRequest);
        return ResponseEntity.ok().body("User registered successfully!");
    }
}
