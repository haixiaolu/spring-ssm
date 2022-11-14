package com.haixiaolu.dao.impl;

import com.haixiaolu.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public String findName(int id, String password) {
        System.out.println("id " + id);
        return "itcast";
    }
}
