package com.example.demo.service;

import com.example.demo.service.dto.CustomerDTO;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    public CustomerDTO getCustomer(){
        return new CustomerDTO( "Daniel","daniel@mail.com","Sweden", "+46555555" );
    }
}
