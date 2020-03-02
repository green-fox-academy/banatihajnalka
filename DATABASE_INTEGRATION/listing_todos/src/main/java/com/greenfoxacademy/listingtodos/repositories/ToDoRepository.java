package com.greenfoxacademy.listingtodos.repositories;

import com.greenfoxacademy.listingtodos.models.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo, Long> {
}
