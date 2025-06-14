package com.xworkz.config;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class UserWebInit extends AbstractAnnotationConfigDispatcherServletInitializer  implements WebMvcConfigurer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("Running in getRootConfigClasses()");
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("Running in getServletConfigClasses() ");
        return new Class[]{UserConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("Running in getServletMappings()");
        return new String[]{"/"};
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        System.out.println("Running in configureDefaultServletHandling");
        configurer.enable();
    }
}
