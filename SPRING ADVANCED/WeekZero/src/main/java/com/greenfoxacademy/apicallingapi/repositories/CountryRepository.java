package com.greenfoxacademy.apicallingapi.repositories;

import com.greenfoxacademy.apicallingapi.models.dtos.CountryResponseDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends CrudRepository<CountryResponseDTO, Long> {

}
