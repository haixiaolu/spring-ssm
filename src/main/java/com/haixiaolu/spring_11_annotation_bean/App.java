package com.haixiaolu.spring_11_annotation_bean;


import com.haixiaolu.spring_11_annotation_bean.dao.BookDao;
import com.haixiaolu.spring_11_annotation_bean.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("annotation.xml");
        BookDao bookdao = (BookDao) ctx.getBean("bookDao");
        System.out.println(bookdao);

        // 用类型查找
        BookService bookService = ctx.getBean(BookService.class);
        System.out.println(bookService);
    }
}
