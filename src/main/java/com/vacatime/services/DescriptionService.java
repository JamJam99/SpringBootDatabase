package com.vacatime.services;

import com.vacatime.models.Description;
import com.vacatime.repositories.DescriptionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DescriptionService {
    private DescriptionRepository descriptionRepository;

    @Autowired
    public DescriptionService(DescriptionRepository descriptionRepository){
        this.descriptionRepository = descriptionRepository;
    }
    public Description getDescription(Long id){
        return descriptionRepository.getOne(id);
    }
    
}
