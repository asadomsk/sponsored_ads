package com.efrats.sponsored_ads.controllers;

import com.efrats.sponsored_ads.entities.Campaign;
import com.efrats.sponsored_ads.services.CreateCampaign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddsController {
    @Autowired
    private CreateCampaign createCampaign;


    @PostMapping (value = "/Create_campaign")
    public Campaign onUpdateReceived(@RequestBody Campaign campaign) {

        Campaign c=createCampaign.getCampaign(campaign);

        return c;
    }
}