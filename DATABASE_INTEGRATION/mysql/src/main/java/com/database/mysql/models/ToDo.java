package com.database.mysql.models;

import javax.persistence.*;

@Entity
public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private boolean isUrgent;
    private boolean isDone;
    @ManyToOne
    private Assignee assignee;

    public ToDo(String title, boolean urgent, boolean done) {
        this.title = title;
        this.isUrgent = urgent;
        this.isDone = done;
    }

    public ToDo() {
    }

    public ToDo(String title) {
        this.title = title;
        this.isUrgent = false;
        this.isDone = false;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean getIsUrgent() {
        return isUrgent;
    }

    public void setIsUrgent(boolean urgent) {
        this.isUrgent = urgent;
    }

    public boolean getIsDone() {
        return isDone;
    }

    public void setIsDone(boolean done) {
        this.isDone = done;
    }

    public boolean isUrgent() {
        return isUrgent;
    }

    public Assignee getAssignee() {
        return assignee;
    }

    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }
}

