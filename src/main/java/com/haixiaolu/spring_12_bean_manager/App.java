package com.haixiaolu.spring_12_bean_manager;

import com.haixiaolu.spring_12_bean_manager.config.SpringConfig;
import com.haixiaolu.spring_12_bean_manager.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = (BookDao) ctx.getBean(BookDao.class);
        bookDao.save();
        System.out.println(bookDao);
        ctx.close();
    }
}
