package com.sda.spring.example;

import com.sda.spring.example.beans.MyBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath*:applicationContext.xml"})
public class Hello2 {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Hello2.class, args);
        MyBean service = context.getBean(MyBean.class);
        System.out.println(service.sayHello());
    }
}
