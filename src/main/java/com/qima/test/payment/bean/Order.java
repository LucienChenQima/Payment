package com.qima.test.payment.bean;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Order {
    private String id;
    private OrderType orderType;
    private String clientName;
    private Long creatTime;
    private List<ChargeItem> chargeItems;
    private String involvedPromotionId;
}
