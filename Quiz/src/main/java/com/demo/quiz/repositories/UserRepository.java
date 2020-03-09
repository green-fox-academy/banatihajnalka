package com.demo.quiz.repositories;

import com.demo.quiz.models.entities.User;
import jdk.nashorn.internal.ir.Optimistic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    Optional<User> findByName(String name);
    Object findByPassword(String password);

    Object findByPasswordAndName(String password, String name);
}
