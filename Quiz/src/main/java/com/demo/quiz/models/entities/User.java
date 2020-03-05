package com.demo.quiz.models.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.HashMap;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String password;
    private String answer;

    public User() {
    }

    public User(String name, String password, String answer) {
        this.name = name;
        this.password = password;
        this.answer = answer;
    }
}
