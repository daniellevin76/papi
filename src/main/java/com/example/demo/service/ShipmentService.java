package com.example.demo.service;

import com.example.demo.entity.Shipment;
import com.example.demo.repository.ShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShipmentService {

    @Autowired
    ShipmentRepository shipmentRepository;

    public void getProduct(){
        Shipment shipment = shipmentRepository.findById(1).get();
        shipment.getCustomer()




                
    }
}
