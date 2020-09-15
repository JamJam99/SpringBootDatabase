package com.vacatime.controllers;


import java.util.List;

import com.vacatime.models.Destination;
import com.vacatime.repositories.DestinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DestinationController {
    @Autowired
    private DestinationRepository destinationRepository;


    @GetMapping("/destinations")
    public List<Destination> all() {
        return destinationRepository.findAll();
    }


    @GetMapping("/destinations/{id}")
    public Destination getDestinationById(@PathVariable("id") Long id) {
        Destination destination = destinationRepository.getOne(id);
        System.out.println(destination);
        return destination;
    }
    
}
