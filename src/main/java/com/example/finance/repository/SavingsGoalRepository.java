package com.example.finance.repository;

import com.example.finance.entity.SavingsGoal;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public class SavingsGoalRepository {
    private final Map<Long, SavingsGoal> savingsGoals = new HashMap<>();
    private long currentId = 1;

    public SavingsGoal save(SavingsGoal savingsGoal) {
        savingsGoal.setId(currentId++);
        savingsGoals.put(savingsGoal.getId(), savingsGoal);
        return savingsGoal;
    }

    public Optional<SavingsGoal> findById(Long id) {
        return Optional.ofNullable(savingsGoals.get(id));
    }

    public void deleteById(Long id) {
        savingsGoals.remove(id);
    }

    public List<SavingsGoal> findAll() {
        return new ArrayList<>(savingsGoals.values());
    }
}
