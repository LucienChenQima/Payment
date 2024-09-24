package com.qima.test.payment.service;

import com.qima.test.payment.bean.*;
import com.qima.test.payment.dao.DatabaseClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final DatabaseClient client;

    public Bill pay(Order order) {
        // TODO;
        return null;
    }

    public List<Promotion> getAllPromotions() {
        return client.getPromotions();
    }

    public List<Product> getAllProducts() {
        return client.getProducts();
    }
}
