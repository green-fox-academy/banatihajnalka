package com.greenfoxacademy.listingtodos.models;

public class ToDo {

    private long id;
    private String title;
    private boolean urgent;
    private boolean done;

    public ToDo(long id, String title, boolean urgent, boolean done) {
        this.id = id;
        this.title = title;
        this.urgent = false;
        this.done = false;
    }
}
