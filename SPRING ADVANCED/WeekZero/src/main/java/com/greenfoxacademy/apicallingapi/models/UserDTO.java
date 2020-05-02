package com.greenfoxacademy.apicallingapi.models;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class UserDTO {

    @NotNull
    @NotEmpty(message = "Username may not be empty")
    private String userName;
    @NotNull
    @NotEmpty(message = "Password may not be empty")
    @Size(min = 8, max = 30)
    private String password;
    @NotNull
    @NotEmpty(message = "Password may not be empty")
    private String matchingPassword;
    @NotNull
    @NotEmpty(message = "Email may not be empty")
//    @Pattern(regexp = "^[@A-Z0-9]")
    private String email;

    public UserDTO() {
    }

    public UserDTO(@NotNull @NotEmpty(message = "Username may not be empty") String userName, @NotNull @NotEmpty(message = "Password may not be empty") @Size(min = 8, max = 30) String password, @NotNull @NotEmpty(message = "Password may not be empty") String matchingPassword, @NotNull @NotEmpty(message = "Email may not be empty") String email) {
        this.userName = userName;
        this.password = password;
        this.matchingPassword = matchingPassword;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
