package com.haixiaolu.spring_07_di_autowire.dao.impl;


import com.haixiaolu.spring_07_di_autowire.dao.BookDao;

public class BookImpl implements BookDao {

    private int connectionNum;
    private String database;

    public void save() {
        System.out.println("book dao save ...");
    }
}
