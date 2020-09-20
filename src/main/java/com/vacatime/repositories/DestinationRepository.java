package com.vacatime.repositories;

import com.vacatime.models.Destination;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface DestinationRepository extends JpaRepository<Destination, Long> {
}
