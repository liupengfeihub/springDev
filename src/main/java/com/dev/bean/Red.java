package com.dev.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

/**
 * @author: liupengfei
 * @Date: 2019/7/21 11:25
 * @Description:
 */
@Component
public class Red implements ApplicationContextAware,BeanNameAware,EmbeddedValueResolverAware {

    private ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("传入的ioc:" + applicationContext);
        this.applicationContext = applicationContext;
    }

    public void setBeanName(String name) {
        System.out.println("当前bean的名字：" + name);
    }

    /**
     * 解析String的占位符
     * @param resolver
     */
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        String resolveStringValue = resolver.resolveStringValue("你好${os.name} 我是#{20*18}");
        System.out.println("解析的字符串："+resolveStringValue);
    }
}
