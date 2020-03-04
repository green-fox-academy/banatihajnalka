package com.database.mysql.repositories;


import com.database.mysql.models.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo, Long> {

    Iterable<ToDo> findAllByIsDone(boolean isActive);

}