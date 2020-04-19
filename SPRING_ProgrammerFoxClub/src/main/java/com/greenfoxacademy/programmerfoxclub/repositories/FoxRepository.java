package com.greenfoxacademy.programmerfoxclub.repositories;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FoxRepository extends CrudRepository<Fox, Long> {

    List<Fox> findAll();

    Optional<Fox> findByName(String foxname);
    Optional<Fox> findByUserUserId(Long userId);
}
