package com.haixiaolu.spring_11_annotation_bean;

import com.haixiaolu.spring_11_annotation_bean.config.SpringConfig;
import com.haixiaolu.spring_11_annotation_bean.dao.BookDao;
import com.haixiaolu.spring_11_annotation_bean.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppForAnnotation {
    public static void main(String[] args) {
        // 这里需要用纯注解的接口， 不需要指定的xml路径
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookdao = (BookDao) ctx.getBean("bookDao");
        System.out.println(bookdao);

        // 用类型查找
        BookService bookService = ctx.getBean(BookService.class);
        System.out.println(bookService);

    }
}
