package com.xworkz.coldcoffe.runner;

import com.xworkz.coldcoffe.configure.ColdCoffeeConfigure;
import com.xworkz.coldcoffe.dto.ColdCoffeDto;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class ColdCoffeeRunner {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ColdCoffeeConfigure.class);
        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
        Object obj = context.getBean("coldCoffeDto");
        System.out.println(obj);
        System.out.println(new ColdCoffeDto(""));

    }
}
