package com.dev.bean;

import org.springframework.stereotype.Component;

/**
 * @author: liupengfei
 * @Date: 2019/7/21 14:15
 * @Description:
 */
@Component
public class Car {

    public Car(){
        System.out.println("cat constructor...");
    }

    public void init(){
        System.out.println("cat...init");
    }

    public void detory(){
        System.out.println("cat...detory");
    }
}
