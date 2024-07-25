package com.example.finance.entity;

import java.time.LocalDate;

public class Transaction {
    private Long id;
    private double amount;
    private LocalDate date;
    private String category;
    private String description;

    // No-argument constructor
    public Transaction() {
    }

    // Parameterized constructor
    public Transaction(Long id, double amount, LocalDate date, String category, String description) {
        this.id = id;
        this.amount = amount;
        this.date = date;
        this.category = category;
        this.description = description;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
}
