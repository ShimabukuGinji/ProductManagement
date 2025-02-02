package com.example.productmanagement.service;

import com.example.productmanagement.entity.InsertProduct;
import com.example.productmanagement.entity.Product;
import com.example.productmanagement.exception.NoSuchPostalCodeException;
import com.example.productmanagement.repository.IProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService implements IProductService {

    @Autowired
    private IProductRepository productRepository;

    @Override
    public List<Product> findAll(){
        return productRepository.findAll();
    }

    @Override
    public int insert(InsertProduct product) throws NoSuchPostalCodeException {
        return productRepository.insert(product);
    }

    @Override
    public int delete(int id) throws NoSuchPostalCodeException {
        return productRepository.delete(id);
    }

    @Override
    public int update(Product product) throws NoSuchPostalCodeException {
        return productRepository.update(product);
    }
}
