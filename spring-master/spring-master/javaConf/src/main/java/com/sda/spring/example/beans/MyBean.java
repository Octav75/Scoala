package com.sda.spring.example.beans;

public class MyBean {

    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String sayHello(){
        return "Hello! " + name;
    }
}
