package com.haixiaolu.spring_04_bean_lifeycle;

import com.haixiaolu.spring_03_bean_instance.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForLifeCycle {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beanlifecycle.xml");
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
        // ApplicationContext 下没有close(),需要在ClassPathXmlApplicationContext下调用close()方法
        ctx.close(); // 第一种关闭IoC容器方式
        // 关闭容器的第二种方法
        // ctx.registerShutdownHook();
    }
}


