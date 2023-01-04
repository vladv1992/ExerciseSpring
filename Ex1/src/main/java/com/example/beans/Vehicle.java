package com.example.beans;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Vehicle  {
   private String name;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

//    @PostConstruct
//    public void init(){
////        this.name = "Audi RS6";
//    }

    public String helloMet(){
        return "hello I'm good";
    }

}








