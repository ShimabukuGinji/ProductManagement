package com.example.productmanagement.repository;

import com.example.productmanagement.entity.Categories;

import java.util.List;

public interface ICategoriesRepository {
    List<Categories> findAll();

    String findByName(String name);
}
