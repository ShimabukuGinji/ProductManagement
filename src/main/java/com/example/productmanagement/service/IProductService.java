package com.example.productmanagement.service;

import com.example.productmanagement.entity.InsertProduct;
import com.example.productmanagement.entity.Product;
import com.example.productmanagement.exception.NoSuchPostalCodeException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IProductService {

    List<Product> findAll();

    int insert(InsertProduct product) throws NoSuchPostalCodeException;

    int delete(int id) throws NoSuchPostalCodeException;

    int update(Product product) throws NoSuchPostalCodeException;
}
