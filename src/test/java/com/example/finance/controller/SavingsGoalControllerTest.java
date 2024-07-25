package com.example.finance.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.finance.entity.SavingsGoal;
import com.example.finance.service.SavingsGoalService;

public class SavingsGoalControllerTest {
    @InjectMocks
    private SavingsGoalController savingsGoalController;

    @Mock
    private SavingsGoalService savingsGoalService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testCreateSavingsGoal() {
        String name = "Vacation";
        double targetAmount = 1000;
        LocalDate targetDate = LocalDate.of(2025, 12, 31);
        SavingsGoal savingsGoal = new SavingsGoal(name, targetAmount, targetDate);
        when(savingsGoalService.createSavingsGoal(name, targetAmount, targetDate)).thenReturn(savingsGoal);

        ResponseEntity<SavingsGoal> response = savingsGoalController.createSavingsGoal(name, targetAmount, targetDate);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(name, response.getBody().getName());
        assertEquals(targetAmount, response.getBody().getTargetAmount());
        assertEquals(targetDate, response.getBody().getTargetDate());
    }
}
