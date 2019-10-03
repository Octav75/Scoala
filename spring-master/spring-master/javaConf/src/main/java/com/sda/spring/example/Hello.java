package com.sda.spring.example;

import com.sda.spring.example.beans.MyBean;
import com.sda.spring.example.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Hello {

    public static void main(String[] args){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        MyBean bean = context.getBean(MyBean.class);
        System.out.println(bean.sayHello());

        bean.setName("Spring first application");
        System.out.println(bean.sayHello());
    }

}
