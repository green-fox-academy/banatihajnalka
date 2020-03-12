package com.database.mysql.repositories;


import com.database.mysql.models.entities.Assignee;
import com.database.mysql.models.entities.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo, Long> {

    Iterable<ToDo> findAllByIsDone(boolean isActive);
    Iterable<ToDo> findAllByTitleContainsIgnoreCase(String title);
    Iterable<ToDo> findAllByDueDate(Date dueDate);
    Iterable<ToDo> findAllByCreationDate(Date dueDate);

    List<ToDo> findAll();
}