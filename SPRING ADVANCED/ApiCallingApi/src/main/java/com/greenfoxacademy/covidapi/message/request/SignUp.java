package com.greenfoxacademy.covidapi.message.request;

import javax.validation.constraints.Email;
import java.util.Set;

public class SignUp {

    private String username;
    private String email;
    private String password;
    private Set<String> role;

    public SignUp() {
    }

    public SignUp(String username, @Email String email, String password, Set<String> role) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<String> getRole() {
        return this.role;
    }

    public void setRole(Set<String> role) {
        this.role = role;
    }
}
