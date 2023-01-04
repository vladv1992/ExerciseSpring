package com.example.main;

import com.example.beans.Vehicle;
import com.example.configuration.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ExempleOne {
    public static void main(String[] args) {

        var contex = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh0 =   contex.getBean("Audi",Vehicle.class);
        System.out.println(veh0.getName());
        System.out.println(veh0.helloMet());

//        Vehicle veh0 =   contex.getBean(Vehicle.class);  if use this, annotatiosn  @Primaru will be select  the vehicle whit this one annotations.



//        Vehicle veh1 = contex.getBean("Honda",Vehicle.class);
//        System.out.println("The mark of vehicle is "+veh1.getName());
//
//
//        Integer nr = contex.getBean(Integer.class);
//        System.out.println("The number is : " + nr);

    }

}