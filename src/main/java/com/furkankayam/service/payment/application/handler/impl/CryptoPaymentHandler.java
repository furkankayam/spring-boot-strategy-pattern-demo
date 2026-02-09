package com.furkankayam.service.payment.application.handler.impl;

import com.furkankayam.common.enums.PaymentType;
import com.furkankayam.dto.payment.CryptoResponseDTO;
import com.furkankayam.service.payment.application.handler.PaymentManagerHandler;
import com.furkankayam.service.payment.model.PaymentCommand;
import com.furkankayam.service.payment.model.PaymentResponseHandlerDTO;
import org.springframework.stereotype.Component;

@Component
public class CryptoPaymentHandler implements PaymentManagerHandler<CryptoResponseDTO> {

    @Override
    public PaymentType type() {
        return PaymentType.CRYPTO;
    }

    @Override
    public PaymentResponseHandlerDTO<CryptoResponseDTO> getPayment(PaymentCommand command) {
        CryptoResponseDTO cryptoResponseDTO = new CryptoResponseDTO(
                command.getPaymentType(),
                "Ethereum",
                command.getAmount()
        );
        return new PaymentResponseHandlerDTO<>(
                cryptoResponseDTO
        );
    }
}