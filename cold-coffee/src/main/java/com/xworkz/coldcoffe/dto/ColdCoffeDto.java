package com.xworkz.coldcoffe.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class ColdCoffeDto {
    @Value("xyz")

    private String coffeName;
    @Value("78.0")
    private double price;
    @Value("cold")
    private String type;

    public ColdCoffeDto(@Value("strong") String coffeeName){
        this.coffeName = coffeeName;
    }

    @Override
    public String toString() {
        return "ColdCoffeDto{" +
                "coffeName='" + coffeName + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                '}';
    }
}
