package com.xworkz.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")


public class UserConfig {

    public UserConfig()
    {
        System.out.println("Running in UserConfig");
    }
}

