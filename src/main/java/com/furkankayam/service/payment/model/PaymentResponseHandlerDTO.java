package com.furkankayam.service.payment.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PaymentResponseHandlerDTO<T> {

    private T paymentResponse;
}