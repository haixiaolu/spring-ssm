package com.haixiaolu.sping_14_annotation_third_bean_manager.dao.impl;

import com.haixiaolu.spring_13_annotation_di.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println("book dao save ...");
    }
}
