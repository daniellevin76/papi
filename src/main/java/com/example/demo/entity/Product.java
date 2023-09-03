package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;
    private String name;

    private int qnt;

    private boolean soldOut;

    public Product(String name, int qnt, boolean soldOut) {
        this.name = name;
        this.qnt = qnt;
        this.soldOut = soldOut;
    }

    @ManyToOne
    private Shipment shipment;

}
