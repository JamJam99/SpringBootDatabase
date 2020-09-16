
package com.vacatime.services;

import com.vacatime.models.Package;
import com.vacatime.repositories.PackageRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PackageService {
    private PackageRepository packageRepository;

    @Autowired
    public PackageService(PackageRepository packageRepository){
        this.packageRepository = packageRepository;
    }

    public Package getPackage(Long id){
        return packageRepository.getOne(id);
    }
    
}
