package com.haixiaolu.spring_03_bean_instance.factory;

import com.haixiaolu.spring_03_bean_instance.dao.UserDao;
import com.haixiaolu.spring_03_bean_instance.dao.impl.UserDaoImpl;

public class UserDaoFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
