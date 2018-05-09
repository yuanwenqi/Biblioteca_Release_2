package com.twu.biblioteca;

public class User {

    private final String name;
    private final String email;
    private final String phone;

    public User(String name, String email, String phone){

        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}
