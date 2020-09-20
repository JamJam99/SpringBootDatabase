package com.vacatime.controllers;

import java.util.List;

import com.vacatime.dto.BookingReqDto;
import com.vacatime.dto.PaymentReqDto;
import com.vacatime.models.Booking;

import com.vacatime.models.Customer;
import com.vacatime.models.Package;
import com.vacatime.services.BookingService;
import com.vacatime.services.CustomerService;
import com.vacatime.services.PackageService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("booking")
public class BookingController {

    private final BookingService bookingService;
    private final CustomerService customerService;
    private final PackageService packageService;

    public BookingController(
            BookingService bookingService,
            CustomerService customerService,
            PackageService packageService
    ) {
        this.bookingService = bookingService;
        this.customerService = customerService;
        this.packageService = packageService;
    }

    @GetMapping
    public List<Booking> findAllBooking() {
        return bookingService.findAll();
    }

    @GetMapping("customer/{id}")
    public Booking findCustomerBooking(@PathVariable("id") Long id) {
        return bookingService.findCustomerBookingById(id);
    }

    @GetMapping("{id}")
    public Booking findBookingById(@PathVariable("id") Long id) {
        return bookingService.findBookingById(id);
    }

    @PostMapping
    public Booking createBooking(@Valid @RequestBody BookingReqDto booking) {
        Customer customer = customerService.findById(booking.getCustomerId());
        Package aPackage = packageService.findById(booking.getPackageId());
        return bookingService.create(customer, aPackage, booking.getDate());
    }

    @PatchMapping("{id}")
    public Booking addPayment(
            @PathVariable("id") Long id,
            @Valid @RequestBody PaymentReqDto payment
    ) {
        Booking booking = bookingService.findBookingById(id);
        return bookingService.addPayment(booking, payment);
    }

}
