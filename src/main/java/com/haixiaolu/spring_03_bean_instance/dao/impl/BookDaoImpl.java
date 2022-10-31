package com.haixiaolu.spring_03_bean_instance.dao.impl;

import com.haixiaolu.spring_03_bean_instance.dao.BookDao;

public class BookDaoImpl implements BookDao {

    private BookDaoImpl() {
        System.out.println("book dao constructor is running...");
    }

    @Override
    public void save() {
        System.out.println("book dao save ...");
    }
}
