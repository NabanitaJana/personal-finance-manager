package com.example.finance.repository;

import com.example.finance.entity.Category;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Repository;

@Repository
public class CategoryRepository {
    private final Map<Long, Category> categories = new HashMap<>();
    private long currentId = 1;

    public Category save(Category category) {
        category.setId(currentId++);
        categories.put(category.getId(), category);
        return category;
    }

    public Optional<Category> findById(Long id) {
        return Optional.ofNullable(categories.get(id));
    }

    public void deleteById(Long id) {
        categories.remove(id);
    }
}