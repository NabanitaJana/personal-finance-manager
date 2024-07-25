package com.example.finance.entity;

public class Category {
    private Long id;
    private String name;

    // No-argument constructor
    public Category() {
    }

    // Parameterized constructor
    public Category(String name) {
        this.name = name;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}