package com.haixiaolu.spring_13_annotation_di.service.impl;

import com.haixiaolu.spring_13_annotation_di.dao.BookDao;
import com.haixiaolu.spring_13_annotation_di.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl1 implements BookService {
    @Autowired
    @Qualifier("bookDao")
    private BookDao bookDao;

//    public void setBookDao(BookDao bookDao) {
//        this.bookDao = bookDao;
//    }

    @Override
    public void save() {
        System.out.println("book service saving ...");
        bookDao.save();
    }
}
