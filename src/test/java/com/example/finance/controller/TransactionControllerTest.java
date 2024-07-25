package com.example.finance.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import com.example.finance.entity.Transaction;
import com.example.finance.service.TransactionService;

public class TransactionControllerTest {
    @InjectMocks
    private TransactionController transactionController;

    @Mock
    private TransactionService transactionService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
void testAddTransaction() {
    Long id = 1L; // Add a value for id
    double amount = 200;
    LocalDate date = LocalDate.now();
    String category = "Food";
    String description = "Lunch";

    Transaction transaction = new Transaction(id, amount, date, category, description);
    when(transactionService.addTransaction(id, amount, date, category, description)).thenReturn(transaction);

    ResponseEntity<Transaction> response = transactionController.addTransaction(id, amount, date, category, description);

    assertEquals(amount, response.getBody().getAmount());
    assertEquals(date, response.getBody().getDate());
    assertEquals(category, response.getBody().getCategory());
    assertEquals(description, response.getBody().getDescription());
}

}
