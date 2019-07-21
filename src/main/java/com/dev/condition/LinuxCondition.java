package com.dev.condition;

import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.ConditionalConverter;

/**
 * @author: liupengfei
 * @Date: 2019/7/21 11:05
 * @Description: 是否为linux系统
 */
public class LinuxCondition implements ConditionalConverter {

    /**
     *
     * @param sourceType
     * @param targetType
     * @return
     */
    public boolean matches(TypeDescriptor sourceType, TypeDescriptor targetType) {
        return false;
    }
}
