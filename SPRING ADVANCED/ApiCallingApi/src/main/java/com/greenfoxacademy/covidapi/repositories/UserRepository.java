package com.greenfoxacademy.covidapi.repositories;

import com.greenfoxacademy.covidapi.models.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<ApplicationUser, Long> {

    Optional<ApplicationUser> findByUsername(String username);
    Optional<ApplicationUser> findByEmail (String email);
    Boolean existsByEmail(String email);

}
