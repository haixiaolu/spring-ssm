package com.haixiaolu.spring_07_di_autowire.dao.impl;
import com.haixiaolu.spring_07_di_autowire.dao.UserDao;

public class UserImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("User is saving...");
    }
}
