package com.hotelBookingSystem.group.controllers;


import com.hotelBookingSystem.group.models.Features;
import com.hotelBookingSystem.group.repositories.FeaturesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
public class FeaturesController {

    //private final FeaturesService FeaturesService;

    @Autowired
    private FeaturesRepository featuresRepository;
   // public FeaturesController(FeaturesService FeaturesService){

    @PostMapping("/features")
    public Features saveFeatures(@RequestBody Features features){
        return featuresRepository.save(features);
        //this.FeaturesService = FeaturesService;
    }

    @GetMapping("/features/{id}")
   public Features getFeatures(@PathVariable("id") String featuresId){
        return featuresRepository.getFeaturesById(featuresId);
    }

    @DeleteMapping("/features/{id}")
    public String deleteFeatures(@PathVariable("id") String featuresId){
        return featuresRepository.delete(featuresId);
    }

    @PutMapping("/features/{id}")
    public String updateFeatures(@PathVariable("id") String featuresId, @RequestBody Features features) {
        return featuresRepository.update(featuresId, features);
            }

}

