package com.greenfoxacademy.programmerfoxclub.repositories;

import com.greenfoxacademy.programmerfoxclub.models.Trick;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface TrickRepository  extends CrudRepository<Trick, String> {
    Optional<Trick> findByTrick(String trick);
    List<Trick> findAll();
}
