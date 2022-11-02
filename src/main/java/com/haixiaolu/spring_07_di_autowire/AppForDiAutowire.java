package com.haixiaolu.spring_07_di_autowire;

import com.haixiaolu.spring_07_di_autowire.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForDiAutowire {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beandiautowire.xml");
        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();

    }
}


