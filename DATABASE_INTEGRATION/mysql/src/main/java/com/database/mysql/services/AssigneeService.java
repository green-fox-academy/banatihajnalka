package com.database.mysql.services;

import com.database.mysql.models.entities.Assignee;
import com.database.mysql.models.entities.ToDo;
import com.database.mysql.repositories.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AssigneeService {

    private AssigneeRepository assigneeRepository;

    @Autowired
    public AssigneeService(AssigneeRepository assigneeRepository) {
        this.assigneeRepository = assigneeRepository;
    }

    public Iterable<Assignee> findAll() {
        return assigneeRepository.findAll();
    }

    public void addAssignee(Assignee assignee) {
        assigneeRepository.save(assignee);
    }

    public void deleteAssigneeById(Long id) {
        assigneeRepository.deleteById(id);
    }

    public Assignee findAssigneeById(Long id) {
        Optional<Assignee> assignee = assigneeRepository.findById(id);
        return assignee.orElse(null);
    }

    public void editAssigneeById(Long id, Assignee assigneeForm) {
        Optional<Assignee> currentAssignee = assigneeRepository.findById(id);
        if (currentAssignee.isPresent()) {
           Assignee assignee = currentAssignee.get();
           assignee.setName(assigneeForm.getName());
           assigneeRepository.save(assignee);
        }
    }

    public void addToDo(ToDo todo) {
        todo.getAssignee().addToDo(todo);
    }

    public List<ToDo> listAllConnectedTodos(Long id) {
        Optional<Assignee> currentAssignee = assigneeRepository.findById(id);
        if (currentAssignee.isPresent()) {
            List<ToDo> todos = currentAssignee.get().getTodos();
            return todos;
        } else {
            return null;
        }
    }
}
