package com.greenfoxacademy.covidapi.repositories;

import com.greenfoxacademy.covidapi.models.ERole;
import com.greenfoxacademy.covidapi.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}

