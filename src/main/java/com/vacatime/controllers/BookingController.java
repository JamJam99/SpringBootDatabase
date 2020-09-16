package com.vacatime.controllers;

import java.util.List;

import com.vacatime.models.Booking;
import com.vacatime.repositories.BookingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {
    
    @Autowired
    private BookingRepository bookingRepository;

    @GetMapping("/booking")
    public List<Booking> all() {
        return bookingRepository.findAll();
    }

    @GetMapping ("/booking/{id}")
    public Booking getBookingById(@PathVariable("id") Long id) {
        Booking booking = bookingRepository.getOne(id);
        System.out.println(booking);
        return booking;
    }
    
}
