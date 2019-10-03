package com.sda.spring.example.beans;

import com.sda.spring.example.interfaces.BeanName;
import org.springframework.stereotype.Component;

@Component(value = "firstName")
public class FirstName implements BeanName {

    private String name;

    public FirstName(){
        this.name = "SDA";
    }

    public String getName(){
        return this.name;
    }
}
