package com.singtel.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Color {
    GREY("Grey"),
    ORANGE("Orange");

    private String value;
}
