package com.example.ecommerce.controller;

import com.example.ecommerce.model.Product;
import com.example.ecommerce.model.User;
import com.example.ecommerce.service.ProductService;
import com.example.ecommerce.service.UploadFileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Optional;


@Controller
@RequestMapping("/product")
public class ProductController {
//Show through console the product object
    private final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);
    @Autowired
    private ProductService productService;

    private final UploadFileService upload;
    @Autowired
    public ProductController(UploadFileService upload){
        this.upload = upload;
    }

    @GetMapping
    private String showProduct(Model model){
        model.addAttribute("products",productService.findAll());
        return "products/show";
    }

    @GetMapping("/create")
    private String createProduct(){
        return "products/create";
    }
    @PostMapping("/save")
    private String save(Product product, @RequestParam("img") MultipartFile file) throws IOException {
        LOGGER.info("This is the product {}", product);
        User u = new User(1,"","","", "", "","","");
        product.setUser(u);

        //Save images
        if(product.getId() == null){
            String nameImage = upload.saveImages(file);
            product.setImage(nameImage);
        }else{
            if(file.isEmpty()){
                Product p = new Product();
                p = productService.getProduct(product.getId()).get();
                product.setImage(p.getImage());
            }else{
                String nameImage = upload.saveImages(file);
                product.setImage(nameImage);
            }
        }
        productService.save(product);
        return "redirect:/product";
    }

    @GetMapping("/edit/{id}")
    private String editProduct(@PathVariable Integer id, Model model){
        Product product = new Product();
        Optional<Product> productEdit = productService.getProduct((id));
        try{
            product = productEdit.orElseThrow(()->new NoSuchElementException("Product Not Found"));
        } catch (Exception e){
            LOGGER.info("Error",e);
        }
        LOGGER.info("This is the change on Product {}", product);
        model.addAttribute("product", product);
        return "products/edit";
    }

    @PostMapping("/updateProduct")
    private String updateProduct(Product product){
        productService.save(product);
        return "redirect:/product";
    }

    @GetMapping("/delete/{id}")
    private String deleteProduct(@PathVariable Integer id){
        productService.delete(id);
        return "redirect:/product";
    }
}
