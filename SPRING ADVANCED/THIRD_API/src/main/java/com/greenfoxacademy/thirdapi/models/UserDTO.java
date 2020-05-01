package com.greenfoxacademy.thirdapi.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class UserDTO {
    @NotNull
    @NotEmpty(message = "Firstname may not be empty")
    private String firstName;
    @NotNull
    @NotEmpty(message = "Lastname may not be empty")
    private String lastName;
    @NotNull
    @NotEmpty(message = "Password may not be empty")
    private String password;
    @NotNull
    @NotEmpty(message = "Password may not be empty")
    private String matchingPassword;
    @NotNull
    @NotEmpty(message = "Email may not be empty")
    private String email;

    public UserDTO() {
    }

    public UserDTO(String firstName, String lastName, String password, String matchingPassword, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.matchingPassword = matchingPassword;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMatchingPassword() {
        return matchingPassword;
    }

    public void setMatchingPassword(String matchingPassword) {
        this.matchingPassword = matchingPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
