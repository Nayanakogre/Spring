package com.xworkz.coldcoffe.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

//
@ComponentScan("com.xworkz")
@Configuration
public class ColdCoffeeConfigure {
    public ColdCoffeeConfigure()
    {
        System.out.println("ColdCoffeConfigure created!!");
    }
    @Bean
    public String getName()
    {
        return "Hello";
    }
    @Bean
    public ArrayList<String> getCoffee()
    {
        return new ArrayList<>();
    }
    @Bean
    public List<Double> getPrice()
    {
        List<Double> price=new ArrayList<>();
        price.add(1.2);
        price.add(2.2);
        return price;
    }
}
