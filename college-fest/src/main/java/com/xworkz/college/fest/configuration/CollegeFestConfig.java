package com.xworkz.college.fest.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("com.xworkz")

public class CollegeFestConfig implements WebMvcConfigurer {
    public CollegeFestConfig()
    {
        System.out.println("Running in CollegeFestConfig");
    }
}
