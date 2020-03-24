package com.spring.reddit.repositories;

import com.spring.reddit.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findUserByUserName(String userName);

    Optional<User> findUserByPassword(String password);

    Optional<User> findUserByUserId(Long userId);
}
