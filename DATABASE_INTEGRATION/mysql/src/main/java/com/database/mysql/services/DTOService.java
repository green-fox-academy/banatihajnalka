//package com.database.mysql.services;
//
//import com.database.mysql.models.dtos.ToDoDTO;
//import com.database.mysql.models.entities.Assignee;
//import com.database.mysql.models.entities.ToDo;
//import com.database.mysql.repositories.AssigneeRepository;
//import com.database.mysql.repositories.ToDoRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;
//
//@Service
//public class DTOService {
//
//    private AssigneeRepository assigneeRepository;
//    private ToDoRepository toDoRepository;
//
//    @Autowired
//    public DTOService(AssigneeRepository assigneeRepository, ToDoRepository toDoRepository) {
//        this.assigneeRepository = assigneeRepository;
//        this.toDoRepository = toDoRepository;
//    }
//
//    public ToDo saveToDO(ToDoDTO toDoDTO) {
//        ToDo todo = new ToDo(toDoDTO.getTitle(), toDoDTO.getIsUrgent(), toDoDTO.getIsDone());
//        Optional<Assignee> currentAssignee = assigneeRepository.findById(toDoDTO.getAssigneeId());
//        if (currentAssignee.isPresent()) {
//            Assignee assignee = currentAssignee.get();
//            todo.setAssignee(assignee);
//        }
//        return toDoRepository.save(todo);
//    }
//}
