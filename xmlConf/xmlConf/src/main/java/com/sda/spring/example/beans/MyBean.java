package com.sda.spring.example.beans;

import org.springframework.stereotype.Service;

//@Service("myBean")
public class MyBean {

    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String sayHello(){
        return "Hello! " + name;
    }
}
