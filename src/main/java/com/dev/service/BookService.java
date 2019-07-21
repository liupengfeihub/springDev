package com.dev.service;

import com.dev.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.inject.Inject;

/**
 * @author: liupengfei
 * @Date: 2019/7/20 16:49
 * @Description:
 */
@Service
public class BookService {

    //@Qualifier("bookDao")
    //@Autowired(required = false)
    //@Resource(name = "bookDao2")
    @Inject
    private BookDao bookDao;

    public void print(){
        System.out.println(bookDao);
    }

    @Override
    public String toString() {
        return "BookService{" +
                "bookDao=" + bookDao +
                '}';
    }
}
