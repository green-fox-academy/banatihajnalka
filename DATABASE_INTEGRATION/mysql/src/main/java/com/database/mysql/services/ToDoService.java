package com.database.mysql.services;

import com.database.mysql.models.entities.Assignee;
import com.database.mysql.models.entities.ToDo;
import com.database.mysql.repositories.AssigneeRepository;
import com.database.mysql.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class ToDoService {

    private ToDoRepository toDoRepository;
    private AssigneeRepository assigneeRepository;


    @Autowired
    public ToDoService(ToDoRepository toDoRepository, AssigneeRepository assigneeRepository) {
        this.toDoRepository = toDoRepository;
        this.assigneeRepository = assigneeRepository;
    }

    public List<ToDo> findAll() {
        return toDoRepository.findAll();
    }

    public List<ToDo> findAllActive() {
        return toDoRepository.findAllByIsDone(true);
    }

    public List<ToDo> findAllNotActive() {
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


    public List<ToDo> searchByParam(String search, String key) throws ParseException {
        List<ToDo> todos = toDoRepository.findAll();
        List<ToDo> filteredTodos = new ArrayList<>();
        switch (key) {
            case "byAssignee":
                Optional<Assignee> assignee = assigneeRepository.findByName(search);
                if (assignee.isPresent()) {
                    filteredTodos = toDoRepository.findAllByAssignee(assignee.get());
                }
                break;
            case "byTitle":
//                Optional<ToDo> todoByTitle = toDoRepository.findByTitleContainsIgnoreCase(search);
//                if (todoByTitle.isPresent()) {
                    filteredTodos = toDoRepository.findAllByTitleContainsIgnoreCase(search);
                break;
            case "byDueDate":
                for (ToDo todo : todos) {
                    if (todo.getDueDate() != null) {
                        if (todo.getDueDate().toString().equals(search)) {
                            filteredTodos.add(todo);
                        }
                    }
                }
//                String dueDate = search;
//                Date searchDueDate =new SimpleDateFormat("yyyy-MM-dd").parse(dueDate);
//                result = toDoRepository.findAll().stream().filter(todo -> todo.getDueDate().equals(searchDueDate)).
//                        collect(Collectors.toList());
            break;
            case "byCreationDate":
                for (ToDo todo : todos) {
                    if (todo.getCreationDate() != null) {
                        if (todo.getCreationDate().toString().equals(search)) {
                            filteredTodos.add(todo);
                        }
                    }
                }
//                String creationDate = search;
//                Date searchCreationDate =new SimpleDateFormat("yyyy-MM-dd").parse(creationDate);
//                filteredTodos = toDoRepository.findAll().stream().filter(todo -> todo.getCreationDate().equals(searchCreationDate)).
//                        collect(Collectors.toList());
                break;
        }
        return filteredTodos;
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

