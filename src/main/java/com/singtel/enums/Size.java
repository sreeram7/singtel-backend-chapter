package com.singtel.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Size {
    LARGE("Large"),
    SMALL("Small");

    private String value;
}
