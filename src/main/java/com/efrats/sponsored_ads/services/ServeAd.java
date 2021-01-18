package com.efrats.sponsored_ads.services;

import com.efrats.sponsored_ads.entities.Campaign;
import com.efrats.sponsored_ads.entities.Product;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class ServeAd {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public Product getProdByCategory(String category){
        List products = entityManager.createNamedQuery("findMostExpProductInActiveCategory")
                .setParameter("category", category)
                .getResultList();
        if(products.size()>0 ) return (Product) products.get(0);
        else  products = entityManager.createNamedQuery("findMostExpProduct")
                .getResultList();
            return (Product) products.get(0);
    }


}
