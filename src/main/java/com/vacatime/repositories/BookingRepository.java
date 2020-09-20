package com.vacatime.repositories;

import com.vacatime.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    Optional<Booking> findByCustomerId(Long customerId);
}
