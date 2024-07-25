package com.example.finance.service;

import com.example.finance.entity.Category;
import com.example.finance.repository.CategoryRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class CategoryServiceTest {
    @InjectMocks
    private CategoryService categoryService;

    @Mock
    private CategoryRepository categoryRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testCreateCategory() {
        String name = "Food";
        Category category = new Category(name);
        when(categoryRepository.save(any(Category.class))).thenReturn(category);

        Category createdCategory = categoryService.createCategory(name);

        assertNotNull(createdCategory);
        assertEquals(name, createdCategory.getName());
    }
}
