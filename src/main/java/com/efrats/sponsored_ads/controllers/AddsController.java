package com.efrats.sponsored_ads.controllers;
import com.efrats.sponsored_ads.entities.Campaign;
import com.efrats.sponsored_ads.services.CreateCampaign;
import com.efrats.sponsored_ads.services.ServeAd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddsController {
    @Autowired
    private CreateCampaign createCampaign;

    @Autowired
    private ServeAd serveAd;


    @PostMapping (value = "/Create_campaign")
    public Campaign createCamping(@RequestBody Campaign campaign) {

           createCampaign.createCampaign(campaign);

        return createCampaign.getCampaign(campaign.getId());
    }
    @GetMapping (value = "/Serve_ad")
    public List<String> getProductByCategory(@RequestParam(required = true) String category) {

          return serveAd.getProdByCategory(category);

    }

}
