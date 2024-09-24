package com.qima.test.payment.dao;

import com.qima.test.payment.bean.Product;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@ConfigurationProperties(prefix = "data")
public class DatabaseClient {

    private List<Product> products;

    public List<Product> getProducts() {
        return this.products;
    }

    public Product getProductById(String id) {
        return this.products.stream().filter(p -> p.getId().equals(id)).findFirst().get();
    }

    void setProducts(List<Product> products) {
        this.products = products;
    }
}
