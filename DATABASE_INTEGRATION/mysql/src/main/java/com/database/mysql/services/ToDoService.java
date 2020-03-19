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

    public List<ToDo> findActiveOrNot(String isActive) {
        boolean activeSearch = Boolean.parseBoolean(isActive);
        return toDoRepository.findAllByIsDone(!activeSearch);
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

    public Date dateFormatter(String date) throws ParseException {
        return new SimpleDateFormat("yyyy-MM-dd").parse(date);
    }


    public List<ToDo> searchByParam(String search, String key, String isActive) throws ParseException {
        boolean activeSearch = Boolean.parseBoolean(isActive);
        switch (key) {
            case "byAssignee":
                Optional<Assignee> assignee = assigneeRepository.findByName(search);
                if (assignee.isPresent()) {
                    return toDoRepository.findAllByAssigneeAndIsDone(assignee.get(), activeSearch);
                }
            case "byTitle":
                return toDoRepository.findAllByTitleContainsIgnoreCaseAndIsDone(search, activeSearch);
            case "byDueDate":
                 return toDoRepository.findAllByDueDate(dateFormatter(search));
            case "byCreationDate":
                return toDoRepository.findAllByCreationDate(dateFormatter(search));
        }
        return null;
    }

    public void editTodo(Long id, Long assigneeId, ToDo todo) {
        Optional<ToDo> optionalToDo = toDoRepository.findById(id);
        if (optionalToDo.isPresent()) {
            ToDo currentTodo = optionalToDo.get();
            toDoRepository.save(currentTodo);
            Optional<Assignee> optionalAssignee = assigneeRepository.findById(assigneeId);
            if (optionalAssignee.isPresent()) {
                Assignee assignee = optionalAssignee.get();
                currentTodo.setAssignee(assignee);
            }
            toDoRepository.save(todo);
        }
    }

//    public ToDo saveToDO(ToDoDTO toDoDTO) {
//        ToDo todo = new ToDo(toDoDTO.getTitle(), toDoDTO.getIsUrgent(), toDoDTO.getIsDone());
//        Optional<Assignee> currentAssignee = assigneeRepository.findById(toDoDTO.getAssigneeId());
//        if (currentAssignee.isPresent()) {
//            Assignee assignee = currentAssignee.get();
//            todo.setAssignee(assignee);
//        }
//        return toDoRepository.save(todo)
    }