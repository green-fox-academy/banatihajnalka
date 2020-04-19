package com.database.mysql.repositories;

import com.database.mysql.models.entities.Assignee;
import com.database.mysql.models.entities.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo, Long> {

    List<ToDo> findAll();
    List<ToDo> findAllByIsDone(boolean isActive);
    List<ToDo> findAllByTitleContainsIgnoreCaseAndIsDone(String title, boolean isActive);
    List<ToDo> findAllByDueDate(Date dueDate);
    List<ToDo> findAllByCreationDate(Date creationDate);
    List<ToDo> findAllByAssigneeAndIsDone(Assignee assignee, boolean isActive);

}