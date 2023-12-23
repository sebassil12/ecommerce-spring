package com.example.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ecommerce.model.Product;
import com.example.ecommerce.service.ProductService;

@Controller
@RequestMapping("/admin")
public class UserController {
    @Autowired
    private ProductService productService;

    @GetMapping("")
    public String admin(Model model){

        List<Product> products = productService.findAll();
        model.addAttribute("productos", products);
        return "administrator/home";
    }
}
