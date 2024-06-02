package com.example.productmanagement.service;

import com.example.productmanagement.entity.Categories;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICategoriesService {

    List<Categories> findAll();

    String findByName(String name);
}
