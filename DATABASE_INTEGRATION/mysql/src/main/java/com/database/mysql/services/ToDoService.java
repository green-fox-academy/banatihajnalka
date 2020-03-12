package com.database.mysql.services;

import com.database.mysql.models.entities.Assignee;
import com.database.mysql.models.entities.ToDo;
import com.database.mysql.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

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
        return toDoRepository.findAllByTitleContainsIgnoreCase(title);
    }

    public Iterable<ToDo> findByDueDate(Date dueDate) {
        return toDoRepository.findAllByDueDate(dueDate);
    }

    public Iterable<ToDo> findByCreationDate(Date dueDate) {
        return toDoRepository.findAllByCreationDate(dueDate);
    }


    public Iterable<ToDo> searchByParam(String search, String key){
      List<ToDo> result = new ArrayList<>();
        switch (key) {
            case "byAssignee":
                result = toDoRepository.findAll().stream().filter(todo -> todo.getAssignee().getName().toLowerCase().contains(search.toLowerCase())).
                        collect(Collectors.toList());
                break;
            case "byTitle":
                result = toDoRepository.findAll().stream().filter(todo -> todo.getTitle().toLowerCase().contains(search.toLowerCase())).
                        collect(Collectors.toList());
                break;
            case "byDueDate":
                result = toDoRepository.findAll().stream().filter(todo -> todo.getDueDate().toString().contains(search)).
                        collect(Collectors.toList());
                break;
            case "byCreationDate":
                result = toDoRepository.findAll().stream().filter(todo -> todo.getCreationDate().toString().contains(search)).collect(
                        Collectors.toList());
                break;
        }
        return result;
    }





    //    public void delete(Long id) {
//        Optional<ToDo> currentTodo = toDopublic Iterable<ToDo> searchByParam(String searchBy){
//        Iterable<ToDo> searched = new ArrayLiRepository.findById(id);
//        if (currentTodo.isPresent()) {
//            ToDo todo = currentTodo.get();
//            todo.getAssignee().deleteToDo(Optional.of(todo));
//            todo.setAssignee(null);
//            toDoRepository.deleteById(id);
//        }
//    }
}

