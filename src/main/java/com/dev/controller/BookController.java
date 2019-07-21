package com.dev.controller;

import com.dev.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author: liupengfei
 * @Date: 2019/7/20 16:49
 * @Description:
 */
@Controller
public class BookController {

    @Autowired
    private BookService bookService;
}
