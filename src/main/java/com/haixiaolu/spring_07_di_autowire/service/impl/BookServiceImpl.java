package com.haixiaolu.spring_07_di_autowire.service.impl;

import com.haixiaolu.spring_07_di_autowire.dao.BookDao;
import com.haixiaolu.spring_07_di_autowire.service.BookService;


public class BookServiceImpl implements BookService {
    private BookDao bookDao;


    public void setBookDao(BookDao bookDao){
        this.bookDao = bookDao;

    }

    public void save() {
        System.out.println("book service save ..." );
        bookDao.save();

    }

}
