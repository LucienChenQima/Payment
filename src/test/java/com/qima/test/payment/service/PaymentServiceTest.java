package com.qima.test.payment.service;

import com.qima.test.payment.bean.Bill;
import com.qima.test.payment.bean.ChargeItem;
import com.qima.test.payment.bean.Order;
import com.qima.test.payment.bean.OrderType;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.List;

@SpringBootTest
public class PaymentServiceTest {

    @Autowired
    private PaymentService paymentService;

    @Test
    public void testPay() {
        // offline payment: 2 * 2.5 + 15 + 10 = 30.0
        final Order onlineOrder1 = Order.builder()
            .id("test-order-01")
            .chargeItems(List.of(
                ChargeItem.builder().productId("p1").quantity(2).build(),
                ChargeItem.builder().productId("p4").quantity(1).build(),
                ChargeItem.builder().productId("p5").quantity(1).build()
                ))
            .orderType(OrderType.OFF_LINE)
            .clientName("Lucien Chen")
            .creatTime(System.currentTimeMillis())
            .involvedPromotionId(null)
            .build();

        // online payment: (2 * 2.5 + 15 + 10) * 0.85 = 25.5
        final Order offlineOrder1 = Order.builder()
            .id("test-order-02")
            .chargeItems(List.of(
                ChargeItem.builder().productId("p1").quantity(2).build(),
                ChargeItem.builder().productId("p4").quantity(1).build(),
                ChargeItem.builder().productId("p5").quantity(1).build()
            ))
            .orderType(OrderType.ON_LINE)
            .clientName("Lucien Chen")
            .creatTime(System.currentTimeMillis())
            .involvedPromotionId(null)
            .build();

        final Bill testBill1 = paymentService.pay(onlineOrder1);
        final Bill testBill2 = paymentService.pay(offlineOrder1);

        Assertions.assertEquals(testBill1.getTotalPrice().doubleValue(), 30.0);
        Assertions.assertEquals(testBill2.getTotalPrice().doubleValue(), 25.5);
    }

}
