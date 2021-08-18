package com.qima.test.payment.bean;

import lombok.Getter;

public enum OrderType {
    ON_LINE("online"),
    OFF_LINE("offline"),
    INTERNAL("internal");

    @Getter
    private String name;
    private OrderType(String name) {
        this.name = name;
    }
}
