package com.example.finance.service;

import com.example.finance.entity.SavingsGoal;
import com.example.finance.repository.SavingsGoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate; // Ensure this import is present

@Service
public class SavingsGoalService {
    @Autowired
    private SavingsGoalRepository savingsGoalRepository;

    public SavingsGoal createSavingsGoal(String name, double targetAmount, LocalDate targetDate) {
        SavingsGoal savingsGoal = new SavingsGoal(name, targetAmount, targetDate);
        return savingsGoalRepository.save(savingsGoal);
    }

    // Other methods related to savings goals
}
