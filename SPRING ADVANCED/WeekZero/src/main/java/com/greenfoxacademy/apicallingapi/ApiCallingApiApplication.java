package com.greenfoxacademy.apicallingapi;

import com.greenfoxacademy.apicallingapi.models.ERole;
import com.greenfoxacademy.apicallingapi.models.entities.Role;
import com.greenfoxacademy.apicallingapi.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiCallingApiApplication implements CommandLineRunner {

    private RoleRepository roleRepository;

    @Autowired
    public ApiCallingApiApplication(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ApiCallingApiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        roleRepository.save(new Role(ERole.ROLE_USER));
//        roleRepository.save(new Role(ERole.ROLE_ADMIN));
    }
}
