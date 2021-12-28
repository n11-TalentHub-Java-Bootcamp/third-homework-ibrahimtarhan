package com.tarhan.springboot.mongoDb.service;

import com.tarhan.springboot.mongoDb.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();

    Category findById(String id) ;

    Category save(Category category);

    void delete(String id) ;
}
