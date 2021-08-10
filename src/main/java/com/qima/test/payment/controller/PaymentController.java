package com.qima.test.payment.controller;

import com.qima.test.payment.bean.Bill;
import com.qima.test.payment.bean.Order;
import com.qima.test.payment.bean.Product;
import com.qima.test.payment.bean.Promotion;
import com.qima.test.payment.service.PaymentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class PaymentController {

    private PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("promotions")
    public List<Promotion> getAllPromotions() {
        return paymentService.getAllPromotions();
    }

    @GetMapping("products")
    public List<Product> getAllProducts() {
        return paymentService.getAllProducts();
    }

    @GetMapping("pay")
    public Bill pay(@RequestBody Order order) {
        return paymentService.pay(order);
    }

}
