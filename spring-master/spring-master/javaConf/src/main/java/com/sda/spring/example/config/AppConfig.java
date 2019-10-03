package com.sda.spring.example.config;

import com.sda.spring.example.beans.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MyBean myBean(){
        MyBean bean = new MyBean();
        bean.setName("SDA");
        return bean;
    }
}
