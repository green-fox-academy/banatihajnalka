package com.database.mysql.models.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Assignee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    @JoinColumn(name = "assignee_id")
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ToDo> todos;

    public Assignee() {
        todos = new ArrayList<>();
    }

    public Assignee(String name) {
        this.name = name;
        todos = new ArrayList<>();
    }

    public Assignee(String name, String email) {
        this.name = name;
        this.email = email;
        todos = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<ToDo> getTodos() {
        return todos;
    }

    public void setToDos(List<ToDo> todos) {
        this.todos = todos;
    }

    public void addToDo(ToDo todo) {
        todos.add(todo);
        todo.setAssignee(this);
    }

    @Override
    public String toString() {
        return name;
    }

}
