package com.furkankayam.service.payment;

import com.furkankayam.common.enums.PaymentType;
import com.furkankayam.service.payment.application.resolver.PaymentHandlerResolver;
import com.furkankayam.service.payment.model.PaymentCommand;
import com.furkankayam.service.payment.model.PaymentResponseHandlerDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final PaymentHandlerResolver<?> paymentHandlerResolver;

    public PaymentResponseHandlerDTO<?> getPayment(PaymentCommand requestDTO) {
        return paymentHandlerResolver
                .get(PaymentType.fromCode(Integer.valueOf(requestDTO.getPaymentType())))
                .getPayment(requestDTO);
    }
}