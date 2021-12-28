package com.hotelBookingSystem.group.controllers;


import com.hotelBookingSystem.group.models.Features;
import com.hotelBookingSystem.group.services.FeaturesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/features")
public class FeaturesController {

    private final FeaturesService FeaturesService;

    @Autowired
    public FeaturesController(FeaturesService FeaturesService){

        this.FeaturesService = FeaturesService;
    }
    @GetMapping
    public List<Features> getFeatures() {
        return FeaturesService.getFeatures();
    }


}
