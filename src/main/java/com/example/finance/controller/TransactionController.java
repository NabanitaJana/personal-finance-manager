package com.example.finance.controller;

import com.example.finance.entity.Transaction;
import com.example.finance.service.TransactionService;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @PostMapping
public ResponseEntity<Transaction> addTransaction(
        @RequestParam Long id,
        @RequestParam double amount,
        @RequestParam LocalDate date,
        @RequestParam String category,
        @RequestParam String description) {
    Transaction transaction = transactionService.addTransaction(id, amount, date, category, description);
    return ResponseEntity.ok(transaction);
}


    // Other transaction-related endpoints
}