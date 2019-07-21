package com.dev;

import com.dev.bean.Person;
import com.dev.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: liupengfei
 * @Date: 2019/7/20 16:31
 * @Description:
 */
public class MainTest {

    public static void main(String[] args) {
        /*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Person bean = (Person) applicationContext.getBean("person");
        System.out.println(bean);*/

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        /*Person bean = (Person) applicationContext.getBean("person");
        System.out.println(bean);*/

        String[] namesForType = applicationContext.getBeanNamesForType(Person.class);

        for (String name : namesForType) {
            System.out.println(name);
        }



    }
}
