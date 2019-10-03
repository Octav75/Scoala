package com.sda.spring.example;

import com.sda.spring.example.beans.MyBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Hello {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MyBean service = (MyBean) context.getBean("myBean");
        System.out.println(service.sayHello());

        service.setName("Spring first application");
        System.out.println(service.sayHello());
    }
}
