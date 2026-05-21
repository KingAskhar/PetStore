package com.example;

import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Sells")
public class Sells {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Client cliente;
    private ArrayList<Product> products;
    private double cash;

    public Sells(Client client, ArrayList<Product> products, double cash) {
        this.cliente = client;
        this.products = products;
        this.cash = cash;
    }


    @Override
    public String toString() {
        String productName = "";
        for (Product p : products) {
            productName += p.getName() + " ";
        }
        return "Sellers [id]" + id + "clien = " + cliente.getName() + "product = " + productName + "cash = " + cash;
    }
}
