package com.dev.config;

import com.dev.bean.ColorFactoryBean;
import com.dev.bean.Person;
import org.springframework.context.annotation.*;

/**
 * @author: liupengfei
 * @Date: 2019/7/21 10:37
 * @Description:
 */
@Configuration
//@Import({Color.class,Red.class,MyImportSelector.class,MyImportBeanDefinitionRegistrar.class})
//导入组件,id默认是组件的全类名
public class MainConfig2 {
    //默认是单实例的

    /**
     * Scope调整作用域
     * 	 * @see ConfigurableBeanFactory#SCOPE_SINGLETON singleton
     * 	 * @see ConfigurableBeanFactory#SCOPE_PROTOTYPE prototype
     * 	 * @see org.springframework.web.context.WebApplicationContext#SCOPE_REQUEST
     * 	 * @see org.springframework.web.context.WebApplicationContext#SCOPE_SESSION
     * @return
     * prototype 多实例 ioc容器启动并不会去调用方法创建对象房子容器中
     *                  而是在每次获取的时候才会调用方法创建对象
     * singleton 单实例（默认）,IOC容器启动会调用方法创建对象
     *      以后每次获取都是直接从容器（map.get()）中拿
     * SCOPE_REQUEST同一个请求创建一个实例
     * SCOPE_SESSION同一个session创建一个实例
     *
     * Lazy懒加载：
     *      单实例bean,默认在容器启动的时候创建对象
     *      懒加载：容器启动不创建对象，第一次使用（获取）Bean的时候，进行初始化
     *
     */
    //@Scope("prototype")
    @Lazy
    @Bean(name="person")
    public Person person(){
        System.out.println("给容器中添加person...");
        return new Person("张三","25");
    }

    /**
     * @Conditional({Condition}) 按照一定的条件进行判断，满足条件给容器中注册Bean
     * 如果系统是windows给容器中注册 "bill"
     * 如果是linux，给容器中注册"linus"
     */
    @Bean(name = "bill")
    public Person person01(){
        return  new Person("Bill Gates","62");
    }

    @Bean(name = "linus")
    public Person person02(){
        return new Person("linus","50");
    }

    /**
     * 给容器中注册组件
     * 1、包扫描+条件标注注解（@Controller/@Service/@Repository/@Component）[自己写的类]
     * 2、@Bean[导入第三方包里面的组件]
     * 3、@import[快速给容器中导入组件]
     *      1、@Import(要导入到容器中的组件)容器就会自动注册这个组件，id默认是全类名
     *      2、@ImportSelector:返回需要导入的组件的全类名数组
     *      3、ImportBeanDefinitionRegistrar 手动注册Bean到容器中
     * 4、使用Spring提供的FactoryBean(工厂Bean)
     *      1、默认获取到的是工厂bean调用getObject创建的对象
     *      2、要获取工程bean本身，需要在id前面加一个&标识 &ColorFactoryBean
     */
    @Bean
    public ColorFactoryBean colorFactoryBean(){
        return new ColorFactoryBean();
    }
}
