package com.xworkz.coldcoffe.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component

public class ReserveBankImpl implements ReserveBank{
    @Bean
    @Override
    public void deposit() {
        System.out.println("Running in deposit");
    }
}
