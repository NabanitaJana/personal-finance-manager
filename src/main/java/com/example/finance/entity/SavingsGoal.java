package com.example.finance.entity;

import java.time.LocalDate;

public class SavingsGoal {
    private Long id;
    private String name;
    private double targetAmount;
    private LocalDate targetDate;
    private double amountSaved;

    // No-argument constructor
    public SavingsGoal() {
    }

    // Parameterized constructor
    public SavingsGoal(String name, double targetAmount, LocalDate targetDate) {
        this.name = name;
        this.targetAmount = targetAmount;
        this.targetDate = targetDate;
        this.amountSaved = 0;
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

    public double getTargetAmount() {
        return targetAmount;
    }

    public void setTargetAmount(double targetAmount) {
        this.targetAmount = targetAmount;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public double getAmountSaved() {
        return amountSaved;
    }

    public void setAmountSaved(double amountSaved) {
        this.amountSaved = amountSaved;
    }
}
