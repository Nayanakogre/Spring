package com.xworkz.coldcoffe.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component

public class Seed extends Tree{

    @Bean
    public void sprout()

    {
        System.out.println("sprouting");
    }
}
