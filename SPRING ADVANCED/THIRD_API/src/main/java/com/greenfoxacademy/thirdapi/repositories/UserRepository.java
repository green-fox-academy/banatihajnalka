package com.greenfoxacademy.thirdapi.repositories;

import com.greenfoxacademy.thirdapi.models.UserDTO;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends CrudRepository<SecurityProperties.User, Long> {

}
