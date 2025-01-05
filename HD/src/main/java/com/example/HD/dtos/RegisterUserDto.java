package com.example.HD.dtos;

public class RegisterUserDto {
    private String email;

    private String password;

    private String fullname;

    // getters and setters here...

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

    public String getFullname() {
        return fullname;
    }

    public void setFullName(String fullName) {
        this.fullname = fullName;
    }

}
