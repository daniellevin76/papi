package com.example.demo.controller;

import com.example.demo.entity.Customer;
import com.example.demo.entity.Product;
import com.example.demo.service.CustomerService;
import com.example.demo.service.dto.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class CustomerController {



    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/cs", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CustomerDTO> getCustomer(){
        CustomerDTO customer = customerService.getCustomer();
        System.out.println(customer);
      return ResponseEntity.ok(customer);
    }

}
