package com.tutul.databaseConnection.controller;

import com.tutul.databaseConnection.model.Product;
import com.tutul.databaseConnection.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:5173/")
public class ProductController {
    @Autowired
    public ProductRepository productRepository;

    @PostMapping("/product")
    Product newProduct(@RequestBody Product newProduct){return productRepository.save(newProduct);}

    @GetMapping("/products")
    List<Product> getAllProduct(){ return productRepository.findAll();}

}
