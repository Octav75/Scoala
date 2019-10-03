package com.sda.spring.example;

import com.sda.spring.example.beans.MyBean;
import com.sda.spring.example.beans.SecondName;
import com.sda.spring.example.config.AppConfig;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Hello implements CommandLineRunner {

    public static void main(String[] args){
       SpringApplication.run(Hello.class, args);
    }

    public void run(String... args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        MyBean bean = context.getBean(MyBean.class);
        System.out.println(bean.sayHello());

        bean.setName(new SecondName());
        System.out.println(bean.sayHello());
    }
}
