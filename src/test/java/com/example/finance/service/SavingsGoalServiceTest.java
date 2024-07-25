package com.example.finance.service;

import com.example.finance.entity.SavingsGoal;
import com.example.finance.repository.SavingsGoalRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.time.LocalDate;

public class SavingsGoalServiceTest {
    @InjectMocks
    private SavingsGoalService savingsGoalService;

    @Mock
    private SavingsGoalRepository savingsGoalRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testCreateSavingsGoal() {
        String name = "Vacation";
        double targetAmount = 1500;
        LocalDate targetDate = LocalDate.of(2025, 6, 1);
        SavingsGoal savingsGoal = new SavingsGoal(name, targetAmount, targetDate);
        when(savingsGoalRepository.save(any(SavingsGoal.class))).thenReturn(savingsGoal);

        SavingsGoal createdGoal = savingsGoalService.createSavingsGoal(name, targetAmount, targetDate);

        assertNotNull(createdGoal);
        assertEquals(name, createdGoal.getName());
        assertEquals(targetAmount, createdGoal.getTargetAmount());
        assertEquals(targetDate, createdGoal.getTargetDate());
    }
}
