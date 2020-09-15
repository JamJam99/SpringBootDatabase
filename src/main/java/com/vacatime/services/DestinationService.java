package com.vacatime.services;

import com.vacatime.models.Destination;
import com.vacatime.repositories.DestinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DestinationService {
    private DestinationRepository destinationRepository;

    @Autowired
    public DestinationService(DestinationRepository destinationRepository) {
        this.destinationRepository = destinationRepository;
    }

    public Destination getDestination(Long id){
        return destinationRepository.getOne(id);
    }
    
}
