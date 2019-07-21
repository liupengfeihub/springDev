package com.dev.test;

import com.dev.bean.Boss;
import com.dev.bean.Car;
import com.dev.bean.Color;
import com.dev.bean.Person;
import com.dev.config.MainConfigOfAutowired;
import com.dev.config.MainConfigOfPropertyValues;
import com.dev.dao.BookDao;
import com.dev.service.BookService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author: liupengfei
 * @Date: 2019/7/21 16:09
 * @Description:
 */
public class IOCTest_Autowired {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);

    @Test
    public void test01(){
        printBeans(applicationContext);
        BookService bookService = applicationContext.getBean(BookService.class);
        System.out.println(bookService);
        //BookDao bookDao = applicationContext.getBean(BookDao.class);
        //System.out.println(bookDao);
        Boss boss = applicationContext.getBean(Boss.class);
        Car car = applicationContext.getBean(Car.class);
        Color color = applicationContext.getBean(Color.class);
        System.out.println(boss);
        System.out.println(car);
        System.out.println(color);
        System.out.println(applicationContext);
        applicationContext.close();

    }


    private void printBeans(AnnotationConfigApplicationContext applicationContext){
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }
}
