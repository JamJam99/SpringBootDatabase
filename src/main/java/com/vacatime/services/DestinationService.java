package com.vacatime.services;

import com.vacatime.exception.ResourceNotFoundException;
import com.vacatime.models.Destination;
import com.vacatime.repositories.DestinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DestinationService {

    private final DestinationRepository destinationRepository;

    public DestinationService(DestinationRepository destinationRepository) {
        this.destinationRepository = destinationRepository;
    }


    public List<Destination> findAll() {
        return destinationRepository.findAll();
    }

    public Destination findDestinationById(Long id) {
        return destinationRepository.findById(id).orElseThrow(ResourceNotFoundException::new);
    }

    public Destination saveDestination(Destination destination) {
        return destinationRepository.save(destination);
    }
}
