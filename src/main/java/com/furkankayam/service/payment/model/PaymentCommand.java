package com.furkankayam.service.payment.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class PaymentCommand {

    private BigDecimal amount;
    private String paymentType;
}