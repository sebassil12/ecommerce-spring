package com.example.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ecommerce.service.ProductService;

@Controller
@RequestMapping("/")
public class HomeController {
    private ProductService productService;
    
    @Autowired
    public HomeController(ProductService productService){
        this.productService=productService;
    }

    @GetMapping
    public String home(Model model){
        model.addAttribute("products", productService.findAll());
        return "user/home";
    }
}
