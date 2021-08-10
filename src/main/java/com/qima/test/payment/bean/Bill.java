package com.qima.test.payment.bean;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
public class Bill {
    private String orderId;
    private String clientName;
    private List<ChargeItem> chargeItems;
    private String involvedPromotionId;
    private BigDecimal totalPrice;
}
