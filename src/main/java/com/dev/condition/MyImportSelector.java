package com.dev.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author: liupengfei
 * @Date: 2019/7/21 11:29
 * @Description: 自定义逻辑需要导入的组件
 */
public class MyImportSelector implements ImportSelector {
    /**
     * 返回值就是要导入到容器中的组件的全类型
     * AnnotationMetadata：当前标注@Import注解的所有注解信息
     * @param importingClassMetadata
     * @return
     */
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
       //importingClassMetadata
        //方法不要返回null值
        return new String[]{"com.dev.bean.Blue","com.dev.bean.Yellow"};
    }
}
