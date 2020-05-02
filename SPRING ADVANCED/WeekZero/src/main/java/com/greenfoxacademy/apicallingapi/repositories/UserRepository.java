package com.greenfoxacademy.apicallingapi.repositories;

import com.greenfoxacademy.apicallingapi.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
