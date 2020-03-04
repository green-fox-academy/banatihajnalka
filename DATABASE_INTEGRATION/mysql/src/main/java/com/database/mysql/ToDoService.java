package com.database.mysql;

import com.database.mysql.models.ToDo;
import com.database.mysql.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ToDoService {

    private ToDoRepository toDoRepository;

    @Autowired
    public ToDoService(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    public Iterable<ToDo> findAll() {
        return toDoRepository.findAll();
    }

    public Iterable<ToDo> findAllActive() {
        return toDoRepository.findAllByIsDone(true);
    }

    public Iterable<ToDo> findAllNotActive() {
        return toDoRepository.findAllByIsDone(false);
    }

    public void addToDo(ToDo todo) {
        toDoRepository.save(todo);
    }

    public void deleteToDoById(Long id) {
        toDoRepository.deleteById(id);
    }
}

