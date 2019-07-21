package com.dev.bean;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author: liupengfei
 * @Date: 2019/7/20 16:28
 * @Description:
 */
public class Person {

    //使用@Value赋值
    //1、基本数值
    //2、可以写SpEL: #{}
    //3、可以写${}，取出配置文件中的值（在运行的环境变量里面的值）

    @Value("张三")
    private String name;
    @Value("#{20-2}")
    private String age;

    @Value("${person.nickName}")
    private String nickName;

    public Person() {
    }

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
