package com.example.demo.service.dto;

import com.example.demo.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomerDTO {

    private String name;
    private String email;
    private String address;
    private String phone;
//    public CustomerDTO(String name, String email, String address, String phone) {
//        this.name = name;
//        this.email = email;
//        this.address = address;
//        this.phone = phone;
//    }

    public static CustomerDTO fromEntity(Customer customer){
        return new CustomerDTO(customer.getName(), customer.getEmail(), customer.getAddress(), customer.getPhone() );
    }
}
