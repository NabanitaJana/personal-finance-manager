package com.example.finance.repository;

import com.example.finance.entity.Transaction;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public class TransactionRepository {
    private final Map<Long, Transaction> transactions = new HashMap<>();
    private long currentId = 1;

    public Transaction save(Transaction transaction) {
        transaction.setId(currentId++);
        transactions.put(transaction.getId(), transaction);
        return transaction;
    }

    public Optional<Transaction> findById(Long id) {
        return Optional.ofNullable(transactions.get(id));
    }

    public void deleteById(Long id) {
        transactions.remove(id);
    }

    public List<Transaction> findAll() {
        return new ArrayList<>(transactions.values());
    }
}
