package com.greenfoxacademy.programmerfoxclub.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String username;
    private String password;
    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<Fox> foxes;

    public User() {
        foxes = new ArrayList<>();
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        foxes = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<Fox> getFoxes() {
        return foxes;
    }

    public void setFoxes(List<Fox> foxes) {
        this.foxes = foxes;
    }

    public void addFox(Fox fox) {
      foxes.add(fox);
      fox.setUser(this);
    }


}
