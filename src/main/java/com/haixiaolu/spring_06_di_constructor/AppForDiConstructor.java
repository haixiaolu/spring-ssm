package com.haixiaolu.spring_06_di_constructor;

import com.haixiaolu.spring_06_di_constructor.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForDiConstructor {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beandiconstructor.xml");
        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();

    }
}


