package com.furkankayam.dto.payment;

import java.math.BigDecimal;

public record CreditCardResponseDTO(
        String name,
        BigDecimal amount
) {
}