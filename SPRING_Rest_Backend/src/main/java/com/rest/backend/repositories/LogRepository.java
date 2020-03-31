package com.rest.backend.repositories;

import com.rest.backend.models.Log;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogRepository extends CrudRepository<Log, Integer> {

    List<Log> findAll();
}
