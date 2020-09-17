package com.vacatime.controllers;

import java.util.List;

import com.vacatime.models.Payment;
import com.vacatime.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    @Autowired
    private PaymentRepository paymentRepository;

    @GetMapping("/payment")
    public List<Payment> all() {
        return paymentRepository.findAll();
    }

    @GetMapping("/payment/{id}")
    public Payment getPaymentById(@PathVariable("id")Long id){
        Payment payment = paymentRepository.getOne(id);
        System.out.println(payment);
        return payment;
    }
    
}
