package com.greenfoxacademy.apicallingapi.repositories;

import com.greenfoxacademy.apicallingapi.models.entities.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends CrudRepository<Country, Long> {

}
