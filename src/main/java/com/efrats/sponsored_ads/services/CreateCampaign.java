package com.efrats.sponsored_ads.services;

import com.efrats.sponsored_ads.entities.Campaign;
import com.efrats.sponsored_ads.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.PriorityQueue;


@Service
public class CreateCampaign {
//    @Autowired
//    private CreateProduct createProduct;

    @PersistenceContext
   private EntityManager entityManager;

    @Transactional
    public void createCampaign(Campaign c){
        entityManager.persist(c);

    }

//    @Transactional
//    public void AddProdToComp(Long comp_id ,Long prod_id ){
//        Campaign c = getCampaign(comp_id);
//        Product p=createProduct.getProduct(prod_id);
//        c.addProd(p);
//        entityManager.persist(c);
//    }



    @Transactional
    public Campaign getCampaign(Long id){
       return entityManager.find(Campaign.class, id);

    }


}
