package com.twu.biblioteca;

public class User {

    private final String id;
    private final String name;
    private final String email;
    private final String phone;
    private final boolean isCustomer;

    public User(String id,String name,
                String email, String phone,boolean isCustomer){
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.isCustomer = isCustomer;
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

    public String getId() {
        return id;
    }

    public boolean isCustomer() {
        return isCustomer;
    }
}
