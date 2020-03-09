package com.database.mysql.services;

import com.database.mysql.models.Assignee;
import com.database.mysql.models.ToDo;
import com.database.mysql.repositories.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public void add(Assignee assignee) {
        assigneeRepository.save(assignee);
    }
}
