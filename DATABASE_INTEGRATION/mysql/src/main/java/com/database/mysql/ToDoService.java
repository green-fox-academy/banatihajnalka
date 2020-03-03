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
        ArrayList<ToDo> activeTodos = new ArrayList<>();
        for (ToDo todo : toDoRepository.findAll()) {
            if (todo.getIsDone()) {
                activeTodos.add(todo);
            }
        }
        return activeTodos;
    }

    public Iterable<ToDo> findAllNotActive() {
        ArrayList<ToDo> notActiveTodos = new ArrayList<>();
        for (ToDo todo : toDoRepository.findAll()) {
            if (!todo.getIsDone()) {
                notActiveTodos.add(todo);
            }
        }
        return notActiveTodos;
    }

    public void addToDo(ToDo todo) {
        toDoRepository.save(todo);
    }
}

