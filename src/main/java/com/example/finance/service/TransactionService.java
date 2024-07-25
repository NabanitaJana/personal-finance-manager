package com.example.finance.service;

import com.example.finance.entity.Transaction;
import com.example.finance.repository.TransactionRepository;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction addTransaction(Long id, double amount, LocalDate date, String category, String description) {
        Transaction transaction = new Transaction(id, amount, date, category, description);
        return transactionRepository.save(transaction);
    }
    

    // Other transaction-related methods
}

