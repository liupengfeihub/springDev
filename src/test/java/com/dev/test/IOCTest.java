package com.dev.test;

import com.dev.comfig.MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: liupengfei
 * @Date: 2019/7/20 16:51
 * @Description:
 */
public class IOCTest {

    @SuppressWarnings("resource")
    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] definitionNames = applicationContext.getBeanDefinitionNames();

        for (String name : definitionNames){
            System.out.println(name);
        }

    }
}
