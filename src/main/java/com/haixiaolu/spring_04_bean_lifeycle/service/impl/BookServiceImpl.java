package com.haixiaolu.spring_04_bean_lifeycle.service.impl;

import com.haixiaolu.spring_03_bean_instance.dao.BookDao;
import com.haixiaolu.spring_04_bean_lifeycle.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * spring 提供的2个关闭IoC容器的接口 init, dispo
 */
public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }


    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Service destory");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("service init");

    }
}
