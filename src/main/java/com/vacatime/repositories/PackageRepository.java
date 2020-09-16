package com.vacatime.repositories;

import com.vacatime.models.Package;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PackageRepository extends JpaRepository <Package,Long>{
    
}
