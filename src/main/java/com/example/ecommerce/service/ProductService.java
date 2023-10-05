package com.example.ecommerce.service;

import com.example.ecommerce.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    public Product save(Product product);
    public Optional<Product> getProduct(Integer id);
    public void update(Product product);
    public void delete(Integer id);
    public List<Product> findAll();

}
