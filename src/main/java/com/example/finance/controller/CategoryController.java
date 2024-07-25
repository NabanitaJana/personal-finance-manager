package com.example.finance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.finance.entity.Category;
import com.example.finance.service.CategoryService;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public ResponseEntity<Category> createCategory(@RequestBody String name) {
        return ResponseEntity.ok(categoryService.createCategory(name));
    }

    // Other category-related endpoints
}
