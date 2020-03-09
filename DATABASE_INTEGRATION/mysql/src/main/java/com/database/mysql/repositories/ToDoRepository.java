package com.database.mysql.repositories;


import com.database.mysql.models.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo, Long> {

    Iterable<ToDo> findAllByIsDone(boolean isActive);
    Iterable<ToDo> findAllByTitleContains(String title);

}