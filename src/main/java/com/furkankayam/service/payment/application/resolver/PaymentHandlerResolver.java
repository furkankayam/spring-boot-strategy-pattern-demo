package com.furkankayam.service.payment.application.resolver;

import com.furkankayam.common.enums.PaymentType;
import com.furkankayam.service.payment.application.handler.PaymentManagerHandler;
import org.springframework.stereotype.Component;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Component
public class PaymentHandlerResolver<T> {

    private final Map<PaymentType, PaymentManagerHandler<T>> map = new EnumMap<>(PaymentType.class);

    public PaymentHandlerResolver(List<PaymentManagerHandler<T>> strategies) {
        for (PaymentManagerHandler<T> p : strategies) {
            map.put(p.type(), p);
        }
    }

    public PaymentManagerHandler<T> get(PaymentType paymentType) {
        PaymentManagerHandler<T> handler = map.get(paymentType);
        if (Objects.isNull(handler)) {
            throw new RuntimeException(
                    "Type Not Found. Type: %s"
                            .formatted(paymentType)
            );
        }
        return handler;
    }
}