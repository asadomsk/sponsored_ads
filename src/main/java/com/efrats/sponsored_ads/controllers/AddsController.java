package com.efrats.sponsored_ads.controllers;
import com.efrats.sponsored_ads.entities.Campaign;
import com.efrats.sponsored_ads.services.CreateCampaign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddsController {
    @Autowired
    private CreateCampaign createCampaign;


    @PostMapping (value = "/Create_campaign")
    public Campaign createCamping(@RequestBody Campaign campaign) {

           createCampaign.createCampaign(campaign);

        return null ;
    }
}
