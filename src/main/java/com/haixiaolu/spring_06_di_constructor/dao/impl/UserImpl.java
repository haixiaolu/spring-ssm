package com.haixiaolu.spring_06_di_constructor.dao.impl;

import com.haixiaolu.spring_06_di_constructor.dao.UserDao;

public class UserImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("User is saving...");
    }
}
