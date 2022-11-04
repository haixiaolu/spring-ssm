package com.haixiaolu.spring_10_container;

import com.haixiaolu.spring_10_container.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        // 1. 加载[类路径]下的配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("container.xml");

//        bookDao.save();

        // 2. [文件系统下】的xml配置文件
//        ApplicationContext ctx2 = new FileSystemXmlApplicationContext("/Users/haixiaolu/Desktop/Javapra/Spring/src/main/resources/container.xml");
//        BookDao bookDao1 = (BookDao) ctx2.getBean("bookDao");
//        bookDao1.save();
        /**
         * 获取bean的方式
         */
        //        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        BookDao bookDao = ctx.getBean("bookDao", BookDao.class);
//        BookDao bookDao = ctx.getBean(BookDao.class);
        bookDao.save();

    }
}
