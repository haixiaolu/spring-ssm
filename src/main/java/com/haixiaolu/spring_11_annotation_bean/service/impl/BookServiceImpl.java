package com.haixiaolu.spring_11_annotation_bean.service.impl;

import com.haixiaolu.spring_11_annotation_bean.dao.BookDao;
import com.haixiaolu.spring_11_annotation_bean.service.BookService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component()
public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao){
        this.bookDao = bookDao;
    }
    @Override
    public void save() {
        System.out.println("book service saving...");
    }
}
