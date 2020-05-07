package com.greenfoxacademy.covidapi;

import com.greenfoxacademy.covidapi.models.ERole;
import com.greenfoxacademy.covidapi.models.Role;
import com.greenfoxacademy.covidapi.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CovidapiApplication implements CommandLineRunner {

    private RoleRepository roleRepository;

    @Autowired
    public CovidapiApplication(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(CovidapiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        roleRepository.save(new Role(ERole.ROLE_USER));
        roleRepository.save(new Role(ERole.ROLE_ADMIN));

    }
}
