package com.example.finance.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.finance.entity.Category;
import com.example.finance.service.CategoryService;

public class CategoryControllerTest {
   @InjectMocks
    private CategoryController categoryController;

    @Mock
    private CategoryService categoryService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testCreateCategory() {
        String name = "Food";
        Category category = new Category(name);
        when(categoryService.createCategory(name)).thenReturn(category);

        ResponseEntity<Category> response = categoryController.createCategory(name);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(name, response.getBody().getName());
    }
}
