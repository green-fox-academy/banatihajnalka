package com.database.mysql.services;

import com.database.mysql.models.entities.ToDo;
import com.database.mysql.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

    public ToDo findById(Long id) {
        Optional<ToDo> todo = toDoRepository.findById(id);
        return todo.orElse(null);
    }

    public Iterable<ToDo> findAllByTitleContains(String title) {
        return toDoRepository.findAllByTitleContains(title);
    }
}

