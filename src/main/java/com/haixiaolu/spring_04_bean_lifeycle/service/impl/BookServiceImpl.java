package com.haixiaolu.spring_04_bean_lifeycle.service.impl;

import com.haixiaolu.spring_03_bean_instance.dao.BookDao;
import com.haixiaolu.spring_04_bean_lifeycle.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }


    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
}
