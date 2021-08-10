package com.qima.test.payment.bean;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Promotion {
    private String id;
    private String productId;
    private Integer quantity;
    private BigDecimal totalPrice;
}
