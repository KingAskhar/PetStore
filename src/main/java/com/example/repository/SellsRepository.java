package com.example.repository;

import com.example.Sells;
import com.example.repository.impl.GenericRepositoryImpl;
import jakarta.persistence.EntityManager;

public class SellsRepository extends GenericRepositoryImpl<Sells, Long> {
    public SellsRepository(EntityManager em) {
        super(em, Sells.class);
    }
}