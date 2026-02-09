package com.furkankayam.dto.payment;

import java.math.BigDecimal;

public record CryptoResponseDTO(
        String name,
        String cryptoName,
        BigDecimal amount
) {
}