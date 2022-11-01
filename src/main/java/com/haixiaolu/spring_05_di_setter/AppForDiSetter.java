package com.haixiaolu.spring_05_di_setter;

import com.haixiaolu.spring_05_di_setter.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForDiSetter {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beandisetter.xml");
        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();

    }
}


