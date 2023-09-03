package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductDTO;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired

    ProductService productService;

    @PostMapping("/add")
    public ProductDTO addProduct(@RequestBody ProductDTO productDTO){
        return productService.addProduct(productDTO);
    }

    @GetMapping(value = "/product/v2/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Product> getV2(@PathVariable("id") int id) {
        return ResponseEntity.ok(new Product("Kevin", 50, false));
    }
}
