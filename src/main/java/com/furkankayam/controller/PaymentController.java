package com.furkankayam.controller;

import com.furkankayam.service.payment.PaymentService;
import com.furkankayam.service.payment.model.PaymentCommand;
import com.furkankayam.service.payment.model.PaymentResponseHandlerDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping("/strategy")
    public ResponseEntity<PaymentResponseHandlerDTO<?>> getPayment(@RequestBody PaymentCommand paymentCommand) {
        PaymentResponseHandlerDTO<?> response = paymentService.getPayment(paymentCommand);
        return ResponseEntity.ok(response);
    }
}