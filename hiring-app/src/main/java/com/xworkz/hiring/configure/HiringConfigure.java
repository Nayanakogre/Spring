package com.xworkz.hiring.configure;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
@ComponentScan("com.xworkz")

public class HiringConfigure implements WebMvcConfigurer {
    public HiringConfigure()
    {
        System.out.println("Running HiringConfigure");
    }
}
