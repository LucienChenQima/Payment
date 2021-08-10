package com.qima.test.payment.bean;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChargeItem {
    private String productId;
    private Integer quantity;
}
