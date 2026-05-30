package com.example;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Sells")
public class Sells {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client cliente;

    @ManyToMany
    @JoinTable(
        name = "sells_products",
        joinColumns = @JoinColumn(name = "sell_id"),
        inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Product> products = new ArrayList<>();

    private double cash;

    public Sells() {}

    public Sells(Client cliente, List<Product> products, double cash) {
        this.cliente = cliente;
        this.products = products;
        this.cash = cash;
    }

    public Long getId() { return id; }
    public Client getCliente() { return cliente; }
    public void setCliente(Client cliente) { this.cliente = cliente; }
    public List<Product> getProducts() { return products; }
    public void setProducts(List<Product> products) { this.products = products; }
    public double getCash() { return cash; }
    public void setCash(double cash) { this.cash = cash; }

    @Override
    public String toString() {
        String productNames = "";
        for (Product p : products) {
            productNames += p.getName() + " ";
        }
        return "Sell [id=" + id + ", cliente=" + cliente.getName() + ", productos=" + productNames + ", total=" + cash + "]";
    }
}