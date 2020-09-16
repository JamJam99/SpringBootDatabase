package com.vacatime.controllers;

import java.util.List;


import com.vacatime.models.Description;
import com.vacatime.repositories.DescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DescriptionController {

    @Autowired 
    private DescriptionRepository descriptionRepository;


    @GetMapping("/description")
    public List<Description> all(){
        return descriptionRepository.findAll();
    }
    
    @GetMapping("/description/{id}")
    public Description getDescriptionById(@PathVariable("id") Long id) {
        Description description = descriptionRepository.getOne(id);
        System.out.println(description);
        return description;
    }
    
}
