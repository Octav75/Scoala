package com.sda.spring.example.beans;

import com.sda.spring.example.interfaces.BeanName;
import org.springframework.stereotype.Component;

@Component(value = "secondName")
public class SecondName implements BeanName {

    private String name;

    public SecondName(){
        this.name = "Spring first application";
    }

    public String getName(){
        return this.name;
    }
}
