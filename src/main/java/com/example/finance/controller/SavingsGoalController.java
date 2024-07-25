package com.example.finance.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.finance.entity.SavingsGoal;
import com.example.finance.service.SavingsGoalService;

@RestController
@RequestMapping("/savings-goals")
public class SavingsGoalController {
    @Autowired
    private SavingsGoalService savingsGoalService;

    @PostMapping
    public ResponseEntity<SavingsGoal> createSavingsGoal(@RequestParam String name,
                                                          @RequestParam double targetAmount,
                                                          @RequestParam LocalDate targetDate) {
        return ResponseEntity.ok(savingsGoalService.createSavingsGoal(name, targetAmount, targetDate));
    }

    // Other savings goal-related endpoints
}