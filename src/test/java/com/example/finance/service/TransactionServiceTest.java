package com.example.finance.service;

import com.example.finance.entity.Transaction;
import com.example.finance.repository.TransactionRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.time.LocalDate;

public class TransactionServiceTest {
    @InjectMocks
    private TransactionService transactionService;

    @Mock
    private TransactionRepository transactionRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testAddTransaction() {
        Long id = 1L;
        double amount = 200;
        LocalDate date = LocalDate.now();
        String category = "Food";
        String description = "Lunch";
        Transaction transaction = new Transaction(id, amount, date, category, description);
        when(transactionRepository.save(any(Transaction.class))).thenReturn(transaction);

        Transaction addedTransaction = transactionService.addTransaction(id, amount, date, category, description);

        assertNotNull(addedTransaction);
        assertEquals(id, addedTransaction.getId());
        assertEquals(amount, addedTransaction.getAmount());
        assertEquals(date, addedTransaction.getDate());
        assertEquals(category, addedTransaction.getCategory());
        assertEquals(description, addedTransaction.getDescription());
    }
}
