package com.vacatime.services;

import com.vacatime.models.Booking;
import com.vacatime.repositories.BookingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {
    private BookingRepository bookingRepository;

    @Autowired
    public BookingService(BookingRepository bookingRepository){
        this.bookingRepository = bookingRepository;
    }
    public Booking getBooking(Long id){
        return bookingRepository.getOne(id);
    }
    
}
