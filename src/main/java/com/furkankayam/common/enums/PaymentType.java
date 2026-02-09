package com.furkankayam.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@Getter
@RequiredArgsConstructor
public enum PaymentType {

    CREDIT_CARD(1),
    CRYPTO(2);

    private final int code;

    public static PaymentType fromCode(int code) {
        return Arrays.stream(values())
                .filter(p -> p.code == code)
                .findFirst()
                .orElseThrow(() ->
                    new RuntimeException(
                            "Invalid PaymentType code. Code: %s"
                                    .formatted(code)
                    )
                );
    }
}