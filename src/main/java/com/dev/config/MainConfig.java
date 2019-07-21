package com.dev.config;

import com.dev.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * @author: liupengfei
 * @Date: 2019/7/20 16:34
 * @Description: 配置类==配置文件
 */
@Configuration//告诉String这是一个配置类
@ComponentScan(value="com.dev",includeFilters={
       /* @ComponentScan.Filter(type = FilterType.ANNOTATION,value={Controller.class}),
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,value = {BookService.class}),*/
        @ComponentScan.Filter(type = FilterType.CUSTOM,value = MyTypeFilter.class)
},useDefaultFilters=false)
//@ComponentScan指定要扫描的包
//excludeFilters = Filter[] excludeFilters()排除规则，扫描的时候按照什么规则排除组件
//Filter[] includeFilters()扫描的时候只包含
//FilterType.ANNOTATION按照注解
//FilterType.ASSIGNABLE_TYPE按照給定的类型
//FilterType.CUSTOM自定义规则
public class MainConfig {
    //给容器中注册一个bean;类型为返回值的类型，id默认为方法名
    @Bean(name="person")
    public Person person01(){
        return new Person("lisi","20");
    }
}
