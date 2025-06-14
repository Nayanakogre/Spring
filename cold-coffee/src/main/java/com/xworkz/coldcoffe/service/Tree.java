package com.xworkz.coldcoffe.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component

public class Tree {
    @Bean
    public void climb()
    {
        System.out.println("Climbing");
    }
}
