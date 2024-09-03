package com.shop.jordancode.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.shop.jordancode.Entities.Payment.Payment;
import com.shop.jordancode.Service.PaymentService;

import java.util.List;


@RestController
@RequestMapping("/api/admin/payments")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping
    public ResponseEntity<List<Payment>> getAllPayments() {
        return ResponseEntity.ok(paymentService.getAllPayments());
    }

    @PostMapping
    public ResponseEntity<Payment> createPayment(@RequestBody Payment payment) {
        Payment createdPayment = paymentService.savePayment(payment);
        return ResponseEntity.ok(createdPayment);
    }




}

