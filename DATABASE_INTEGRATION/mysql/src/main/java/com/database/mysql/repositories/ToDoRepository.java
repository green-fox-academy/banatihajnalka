package com.database.mysql.repositories;


import com.database.mysql.models.entities.Assignee;
import com.database.mysql.models.entities.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo, Long> {

    Optional<ToDo> findByTitleContainsIgnoreCase(String title);
    Optional<ToDo> findByDueDate(String dueDate);

    List<ToDo> findAll();
    List<ToDo> findAllByIsDone(boolean isActive);
    List<ToDo> findAllByTitleContainsIgnoreCase(String title);
    List<ToDo> findAllByDueDate(Date dueDate);
    List<ToDo> findAllByCreationDate(Date dueDate);
    List<ToDo> findAllByAssignee(Assignee assignee);


}