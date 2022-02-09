package com.devezq.trackergastos.repository;

import com.devezq.trackergastos.domain.Category;
import com.devezq.trackergastos.exceptions.TgBadRequestException;
import com.devezq.trackergastos.exceptions.TgResourceNotFoundException;

import java.util.List;

public interface CategoryRepository {

    List<Category> findAll(Integer userId) throws TgResourceNotFoundException;

    Category findById(Integer userId, Integer categoryId) throws TgResourceNotFoundException;

    Integer create(Integer userId, String title, String description) throws TgBadRequestException;

    void update(Integer userId, Integer categoryId, Category category) throws TgBadRequestException;

    void removeById(Integer userId, Integer categoryId);
}
