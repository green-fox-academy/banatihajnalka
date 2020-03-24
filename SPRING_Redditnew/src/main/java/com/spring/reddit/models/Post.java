package com.spring.reddit.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer vote;
    private String title;
    private String link;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate creationDate;
    @ManyToOne
    private User user;


    public Post() {
        this.creationDate = LocalDate.now();
        this.vote = 1;
    }

    public Post(String title, String link, User user) {
        this.vote = 1;
        this.title = title;
        this.link = link;
        this.creationDate = LocalDate.now();
        this.user = user;
    }

    public Post(String title, String link) {
        this.creationDate = LocalDate.now();
        this.vote = 0;
        this.title = title;
        this.link = link;
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

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getVote() {
        return vote;
    }

    public void setVote(Integer vote) {
        this.vote = vote;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

