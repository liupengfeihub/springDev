package com.dev.condition;

import com.dev.bean.RainBow;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author: liupengfei
 * @Date: 2019/7/21 11:38
 * @Description:
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    /**
     * AnnotationMetadata当前类的注解信息
     * BeanDefinitionRegistry BeanDefinition注册类
     *        把所有需要添加到容器中的Bean，调用
     *        BeanDefinitionRegistry.registerBeanDefinition手工注册
     * @param importingClassMetadata
     * @param registry
     */
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean red = registry.containsBeanDefinition("com.dev.bean.Red");
        boolean blue = registry.containsBeanDefinition("com.dev.bean.Blue");
        if (red && blue) {
            //指定bean名(Bean的類型，Bean的作用域)
            RootBeanDefinition beanDefinition = new RootBeanDefinition(RainBow.class);
            //注冊一個Bean
            registry.registerBeanDefinition("rainBow",beanDefinition);
        }

    }
}
