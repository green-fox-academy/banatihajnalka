package com.greenfoxacademy.programmerfoxclub.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Action {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long actionId;
    private String action;

    public Action() {
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Action(String action) {
        this.action = action;
    }
}
