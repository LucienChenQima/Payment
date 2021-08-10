package com.qima.test.payment.service;

import com.qima.test.payment.bean.*;
import com.qima.test.payment.dao.DatabaseClient;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PaymentService {

    private DatabaseClient client;


    public PaymentService(DatabaseClient client) {
        this.client = client;
    }

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
