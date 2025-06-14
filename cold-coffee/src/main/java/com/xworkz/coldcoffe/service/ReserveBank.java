package com.xworkz.coldcoffe.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component

public interface ReserveBank {
    @Bean
    public void deposit();
}
