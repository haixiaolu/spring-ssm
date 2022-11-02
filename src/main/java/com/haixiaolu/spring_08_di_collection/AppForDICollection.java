package com.haixiaolu.spring_08_di_collection;

import com.haixiaolu.spring_08_di_collection.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForDICollection {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beandicollection.xml");

        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
    }
}
