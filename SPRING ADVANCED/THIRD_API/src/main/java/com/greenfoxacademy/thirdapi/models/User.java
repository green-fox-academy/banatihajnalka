package com.greenfoxacademy.thirdapi.models;

import javax.persistence.*;

@Entity
@Table(name = "users")
class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String username;
    @OneToOne (cascade = CascadeType.ALL)
    private Client client;

    public User() {
    }

    public User(String username, Client client) {
        this.username = username;
        this.client = client;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
