package com.furkankayam.service.payment.application.handler.impl;

import com.furkankayam.common.enums.PaymentType;
import com.furkankayam.dto.payment.CreditCardResponseDTO;
import com.furkankayam.service.payment.application.handler.PaymentManagerHandler;
import com.furkankayam.service.payment.model.PaymentCommand;
import com.furkankayam.service.payment.model.PaymentResponseHandlerDTO;
import org.springframework.stereotype.Component;

@Component
public class CreditCardPaymentHandler implements PaymentManagerHandler<CreditCardResponseDTO> {

    @Override
    public PaymentType type() {
        return PaymentType.CREDIT_CARD;
    }

    @Override
    public PaymentResponseHandlerDTO<CreditCardResponseDTO> getPayment(PaymentCommand command) {
        CreditCardResponseDTO creditCardResponseDTO = new CreditCardResponseDTO(
                command.getPaymentType(),
                command.getAmount()
        );
        return new PaymentResponseHandlerDTO<>(
                creditCardResponseDTO
        );
    }
}