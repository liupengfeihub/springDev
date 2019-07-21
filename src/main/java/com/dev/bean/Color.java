package com.dev.bean;

import org.springframework.stereotype.Component;

/**
 * @author: liupengfei
 * @Date: 2019/7/21 11:20
 * @Description:
 */
@Component
public class Color {

    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Color{" +
                "car=" + car +
                '}';
    }
}
