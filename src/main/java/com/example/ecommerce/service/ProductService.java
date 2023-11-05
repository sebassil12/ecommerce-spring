package com.example.ecommerce.service;

import com.example.ecommerce.model.Product;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Product save(Product product);
    Optional<Product> getProduct(Integer id);
    void update(Product product);
    void delete(Integer id);
    List<Product> findAll();

}
