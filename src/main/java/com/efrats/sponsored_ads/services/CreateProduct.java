package com.efrats.sponsored_ads.services;

import com.efrats.sponsored_ads.entities.Campaign;
import com.efrats.sponsored_ads.entities.Product;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Service
public class CreateProduct {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void createProduct(Product p){
        entityManager.persist(p);
    }
}
