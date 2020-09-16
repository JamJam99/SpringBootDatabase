package com.vacatime.controllers;

import com.vacatime.repositories.PackageRepository;

import java.util.List;

import com.vacatime.models.Package;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PackageController {

    @Autowired
    private PackageRepository packageRepository;

    @GetMapping("/package")
    public List<Package> all(){
        return packageRepository.findAll();
    }

    @GetMapping("/package/{id}")
    public Package getPackageById(@PathVariable("id")Long id){
        Package packagecode = packageRepository.getOne(id);
        System.out.println(packagecode);
        return packagecode;
    }

    
}
