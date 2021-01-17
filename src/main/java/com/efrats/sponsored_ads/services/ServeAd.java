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
    public List<String> getProdByCategory(String category){
        List name = entityManager.createNamedQuery("findAllCategories")
                .setParameter("category", category)
                .getResultList();
           return name;
    }


}
