package com.example.RestApiController;

public class User {
    private int id;
    private String name;
    private String country;
    private int age;

    public User(int id, String name, String country, int age) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getAge() {
        return age;
    }
}
