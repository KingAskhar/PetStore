package com.example;
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
@Table(name = "Clientes")
public class Client {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String cc;
    private String phone;
    private String email;
    private String adress;

    public Client() {

    }
    
    public Client(String name, String cc, String phone, String email, String adress){
        this.name = name;
        this.cc = cc;
        this.phone = phone;
        this.email = email;
        this.adress = adress;
    }
}

