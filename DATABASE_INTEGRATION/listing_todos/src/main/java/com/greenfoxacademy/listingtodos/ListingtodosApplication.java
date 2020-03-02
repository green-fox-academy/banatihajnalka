package com.greenfoxacademy.listingtodos;

import com.greenfoxacademy.listingtodos.models.ToDo;
import com.greenfoxacademy.listingtodos.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListingtodosApplication implements CommandLineRunner {

    private ToDoRepository toDoRepository;

    @Autowired
    public ListingtodosApplication(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ListingtodosApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        toDoRepository.save(new ToDo("I have to learn Object Relational Mapping"));
        toDoRepository.save(new ToDo("I have to finish the exercises"));
        toDoRepository.save(new ToDo("I have do the washing"));
    }
}
