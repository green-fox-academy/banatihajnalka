package com.database.mysql;

import com.database.mysql.models.ToDo;
import com.database.mysql.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MysqlApplication implements CommandLineRunner {

    private ToDoRepository toDoRepository;

    @Autowired
    public MysqlApplication(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(MysqlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        toDoRepository.save(new ToDo("I have to learn Object Relational Mapping", true, false));
        toDoRepository.save(new ToDo("I have to finish the exercises", false, false));
        toDoRepository.save(new ToDo("I have do the washing", false, false));
        toDoRepository.save(new ToDo("I have to make the demo for Friday", true, false));
        toDoRepository.save(new ToDo("I have to eat something", false, true));
        toDoRepository.save(new ToDo("I have to feed my geckos", true, true));
    }
}
