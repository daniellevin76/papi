package com.example.demo.service;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.service.dto.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public CustomerDTO getCustomerById(int id) {
      Customer customer =  customerRepository
              .findById(id)
              .orElseThrow(() -> new RuntimeException("Customer with id " + id + " was not found"));
      return CustomerDTO.fromEntity(customer);
    }

    
}

