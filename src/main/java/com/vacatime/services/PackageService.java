
package com.vacatime.services;

import com.vacatime.exception.ResourceNotFoundException;
import com.vacatime.models.Package;
import com.vacatime.repositories.PackageRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PackageService {

    private final PackageRepository packageRepository;

    public PackageService(PackageRepository packageRepository) {
        this.packageRepository = packageRepository;
    }

    public List<Package> findAll() {
        return packageRepository.findAll();
    }

    public Package findById(Long id) {
        return packageRepository.findById(id).orElseThrow(ResourceNotFoundException::new);
    }
}
