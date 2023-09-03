package com.example.demo.service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public ProductDTO addProduct(ProductDTO productDTO){
        Product newProduct = new Product(productDTO.getProductName(), productDTO.getProductQnt(), productDTO.isSoldOut());
        productRepository.saveAndFlush(newProduct);
        List<Product> productList = productRepository.findAll();
        return ProductDTO.fromEntity(productList.get(productList.size()-1));
    }
}
