package com.dev.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author: liupengfei
 * @Date: 2019/7/21 14:36
 * @Description:
 */
@Component
public class Dog {
    public Dog() {
        System.out.println("dog constructor...");
    }

    /**
     * 对象创建并赋值之后调用
     */
    @PostConstruct
    public void init(){
        System.out.println("Dog...PostConstruct...");
    }

    @PreDestroy
    public void detory(){
        System.out.println("Dog...PreDestroy...");

    }
}
