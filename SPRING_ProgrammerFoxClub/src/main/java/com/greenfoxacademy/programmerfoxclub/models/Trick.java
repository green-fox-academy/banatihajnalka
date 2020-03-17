package com.greenfoxacademy.programmerfoxclub.models;

import javax.persistence.*;

@Entity
public class Trick {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long trickId;
    private String trick;

    public Trick() {
    }

    public Trick(String trick) {
        this.trick = trick;
    }

    public String getTrick() {
        return trick;
    }

    public void setTrick(String trick) {
        this.trick = trick;
    }

    public Long getTrickId() {
        return trickId;
    }

    public void setTrickId(Long trickId) {
        this.trickId = trickId;
    }
}
