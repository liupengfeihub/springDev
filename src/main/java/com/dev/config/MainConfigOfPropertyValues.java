package com.dev.config;

import com.dev.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author: liupengfei
 * @Date: 2019/7/21 16:08
 * @Description: 使用PropertySource读取外部配置文件中的k/v保存到运行的环境变量中
 */
@PropertySource(value={"classpath:/person.properties"})
@Configuration
public class MainConfigOfPropertyValues {

    @Bean
    public Person person(){
        return new Person();
    }
}
