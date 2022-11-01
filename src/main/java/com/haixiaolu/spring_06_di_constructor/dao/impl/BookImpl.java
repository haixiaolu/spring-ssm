package com.haixiaolu.spring_06_di_constructor.dao.impl;

import com.haixiaolu.spring_03_bean_instance.dao.BookDao;

public class BookImpl implements BookDao {

    private int connectionNum;
    private String database;

    public BookImpl(int connectionNum, String database) {
        this.connectionNum = connectionNum;
        this.database = database;
    }

    @Override
    public void save() {
        System.out.println("book dao save ...");
    }
}
