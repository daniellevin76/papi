package com.example.demo.service;

import com.example.demo.entity.Product;
import com.example.demo.entity.Shipment;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.OneToOne;

@Data
@AllArgsConstructor
public class ProductDTO {
    private String productName;
    private int productQnt;
    private boolean soldOut;

    @OneToOne
    private Shipment shipment;

    public static ProductDTO fromEntity(Product product) {
        return new ProductDTO(product.getName(), product.getQnt(),
                product.isSoldOut(), product.getShipment());
    }
}
