package com.haixiaolu.spring_13_annotation_di;

import com.haixiaolu.spring_13_annotation_di.config.SpringConfig;
import com.haixiaolu.spring_13_annotation_di.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bookService = ctx.getBean(BookService.class);
        bookService.save();

    }
}
