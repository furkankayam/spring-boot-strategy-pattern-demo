package com.furkankayam.service.payment.application.handler;

import com.furkankayam.common.enums.PaymentType;
import com.furkankayam.service.payment.model.PaymentCommand;
import com.furkankayam.service.payment.model.PaymentResponseHandlerDTO;

public interface PaymentManagerHandler<T> {

    PaymentType type();
    PaymentResponseHandlerDTO<T> getPayment(PaymentCommand command);
}