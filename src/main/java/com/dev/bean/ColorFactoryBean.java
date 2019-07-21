package com.dev.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author: liupengfei
 * @Date: 2019/7/21 11:51
 * @Description: 创建一个Spring定义的FactoryBean
 */
public class ColorFactoryBean implements FactoryBean {

    /**
     * 返回color对象，这个对象会添加到容器中
     * @return
     * @throws Exception
     */
    public Object getObject() throws Exception {
        System.out.println("ColorFactoryBean...getObject()");
        return new Color();
    }

    public Class<?> getObjectType() {
        return Color.class;
    }

    /**
     * 是否是单例
     * true,这个bean是单实例，在容器中保存一份
     * false多实例，每次获取都会创建一个新的bean
     * @return
     */
    public boolean isSingleton() {
        return false;
    }
}
