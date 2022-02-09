package com.devezq.trackergastos.services;

import com.devezq.trackergastos.domain.Category;
import com.devezq.trackergastos.exceptions.TgBadRequestException;
import com.devezq.trackergastos.exceptions.TgResourceNotFoundException;

import java.util.List;

public interface CategoryService {
    List<Category> fetchAllCategories(Integer userId);

    Category fetchCategoryById(Integer userId, Integer categoryId) throws TgResourceNotFoundException;

    Category addCategory(Integer userId, String title, String description) throws TgBadRequestException;

    void updateCategory(Integer userId, Integer categoryId, Category category) throws TgBadRequestException;

    void removeCategoryWithAllTransactions(Integer userId, Integer categoryId) throws TgResourceNotFoundException;
}
