package com.vacatime.services;

import com.vacatime.dto.PaymentReqDto;
import com.vacatime.exception.ResourceNotFoundException;
import com.vacatime.models.Booking;
import com.vacatime.models.Customer;
import com.vacatime.models.Package;
import com.vacatime.models.Payment;
import com.vacatime.repositories.BookingRepository;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public Booking findBookingById(Long id) {
        return bookingRepository.findById(id).orElseThrow(ResourceNotFoundException::new);
    }


    public List<Booking> findAll() {
        return bookingRepository.findAll();
    }

    public Booking findCustomerBookingById(Long customerId) {
        return bookingRepository.findByCustomerId(customerId).orElseThrow(ResourceNotFoundException::new);
    }

    public Booking create(Customer customer, Package aPackage, LocalDate date) {
        Booking booking = new Booking();
        booking.setAPackage(aPackage);
        booking.setCustomer(customer);
        booking.setDate(date);
        return bookingRepository.save(booking);
    }

    public Booking addPayment(Booking booking, PaymentReqDto paymentDto) {
        Payment payment = new Payment();
        payment.setPayment(paymentDto.getPayment());
        payment.setBooking(booking);
        booking.setPayment(payment);
        return bookingRepository.save(booking);
    }
}
