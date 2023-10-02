package com.example.ecommerce.service;

import com.example.ecommerce.model.Product;

import java.util.Optional;

public interface ProductService {
    public Product saveProduct(Product product);
    public Optional<Product> getProduct(Integer id);
    public void update(Product product);
    public void delete(Integer id);

}
