package com.qima.test.payment.dao;

import com.qima.test.payment.bean.Product;
import com.qima.test.payment.bean.Promotion;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@ConfigurationProperties(prefix = "data")
public class DatabaseClient {

    private List<Product> products;

    private List<Promotion> promotions;

    public List<Product> getProducts() {
        return this.products;
    }

    public List<Promotion> getPromotions() {
        return this.promotions;
    }

    public Product getProductById(String id) {
        return this.products.stream().filter(p -> p.getId().equals(id)).findFirst().get();
    }

    public Promotion getPromotionById(String id) {
        return this.promotions.stream().filter(p -> p.getId().equals(id)).findFirst().get();
    }

    void setProducts(List<Product> products) {
        this.products = products;
    }

    void setPromotions(List<Promotion> promotions) {
        this.promotions = promotions;
    }
}
