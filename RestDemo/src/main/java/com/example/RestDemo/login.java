package com.example.RestDemo;

import org.springframework.stereotype.Component;

@Component
public class login {
    private String username;
    private String email;
    private String password;
    public login() {
    }
    public login(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
}
