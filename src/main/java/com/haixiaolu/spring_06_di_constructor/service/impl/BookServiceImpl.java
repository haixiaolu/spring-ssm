package com.haixiaolu.spring_06_di_constructor.service.impl;

import com.haixiaolu.spring_03_bean_instance.dao.BookDao;
import com.haixiaolu.spring_06_di_constructor.dao.UserDao;
import com.haixiaolu.spring_06_di_constructor.service.BookService;


public class BookServiceImpl implements BookService {
    private BookDao bookDao;
    private UserDao userDao;

    public BookServiceImpl(BookDao bookDao, UserDao userDao) {
        this.bookDao = bookDao;
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("book service save ..." );
        System.out.println("user service save ..." );
        bookDao.save();
        userDao.save();
    }

}
