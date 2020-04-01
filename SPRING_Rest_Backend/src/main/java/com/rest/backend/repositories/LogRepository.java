package com.rest.backend.repositories;

import com.rest.backend.models.Log;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface LogRepository extends PagingAndSortingRepository<Log, Integer> {

    List<Log> findAll();
    Page<Log> findAll(Pageable pageable);
}
