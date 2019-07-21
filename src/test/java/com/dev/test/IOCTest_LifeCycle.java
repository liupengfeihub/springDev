package com.dev.test;

import com.dev.config.MainConfigOfLifeCysle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: liupengfei
 * @Date: 2019/7/21 14:17
 * @Description:
 */
public class IOCTest_LifeCycle {

    @Test
    public void test01(){
        //1、创建ioc容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCysle.class);
        System.out.println("容器创建完成");
        applicationContext.getBean("car");
        //关闭容器
        applicationContext.close();

    }
}
