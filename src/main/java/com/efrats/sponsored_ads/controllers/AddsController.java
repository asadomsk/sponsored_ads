package com.efrats.sponsored_ads.controllers;
import com.efrats.sponsored_ads.entities.Campaign;
import com.efrats.sponsored_ads.entities.Product;
import com.efrats.sponsored_ads.services.CreateCampaign;
import com.efrats.sponsored_ads.services.CreateProduct;
import com.efrats.sponsored_ads.services.ServeAd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddsController {
    @Autowired
    private CreateCampaign createCampaign;

    @Autowired
    private CreateProduct createProduct;


    @Autowired
    private ServeAd serveAd;


    @PostMapping (value = "/Create_campaign")
    public Campaign createCamping(@RequestBody Campaign campaign) {

           createCampaign.createCampaign(campaign);

        return createCampaign.getCampaign(campaign.getCampaign_id());
    }


//    @PostMapping (value = "/Create_product")
//    public void createProduct(@RequestBody Product product) {
//
//        createProduct.createProduct(product);
//    }
//
//    @GetMapping (value = "/add_prod_to_camp")
//    public void addProdToComp(@RequestParam(required = true) Long comp_id, Long prod_id) {
//
//        createCampaign.AddProdToComp(comp_id, prod_id);
//    }



    @GetMapping (value = "/Serve_ad")
    public Product getProductByCategory(@RequestParam(required = true) String category) {

          return serveAd.getProdByCategory(category);

    }



    }


