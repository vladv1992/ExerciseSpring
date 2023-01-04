package com.example.configuration;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@ComponentScan(basePackages = "com.example.beans")
@Configuration
public class ProjectConfig{

    @Bean("Audi")
    Vehicle veh() {
       var c = new Vehicle();
       c.setName("Audi A6");
        return c;
    }


    @Bean(name = "Honda")
    Vehicle vehicle(){
    var cl = new Vehicle();
    cl.setName("Civic");
    return cl;
    }

    @Bean
    Integer number(){
        return 1;
    }



}
