package com.example.productmanagement.repository;

import com.example.productmanagement.entity.InsertProduct;
import com.example.productmanagement.entity.Product;
import com.example.productmanagement.exception.NoSuchPostalCodeException;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();

    int insert(InsertProduct product) throws NoSuchPostalCodeException;

    int delete(int id) throws NoSuchPostalCodeException;

    int update(Product product) throws NoSuchPostalCodeException;
}
