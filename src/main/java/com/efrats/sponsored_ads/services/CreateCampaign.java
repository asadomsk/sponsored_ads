package com.efrats.sponsored_ads.services;

import com.efrats.sponsored_ads.entities.Campaign;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.PriorityQueue;


@Service
public class CreateCampaign {
    @PersistenceContext
   private EntityManager entityManager;

    @Transactional
    public void createCampaign(Campaign c){
        entityManager.persist(c);

    }

    @Transactional
    public Campaign getCampaign(Long id){
       return entityManager.find(Campaign.class, id);

    }


}
