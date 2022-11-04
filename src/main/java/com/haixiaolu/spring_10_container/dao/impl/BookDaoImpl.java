package com.haixiaolu.spring_10_container.dao.impl;

import com.haixiaolu.spring_10_container.dao.BookDao;

public class BookDaoImpl  implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao saving ...");
    }
}
