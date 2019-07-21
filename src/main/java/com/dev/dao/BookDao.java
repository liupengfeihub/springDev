package com.dev.dao;

import org.springframework.stereotype.Repository;

/**
 * @author: liupengfei
 * @Date: 2019/7/20 16:49
 * @Description:
 */
//名字默认是类名首字母小写的方式
@Repository
public class BookDao {

    private String lable = "1";

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    @Override
    public String toString() {
        return "BookDao{" +
                "lable='" + lable + '\'' +
                '}';
    }
}
