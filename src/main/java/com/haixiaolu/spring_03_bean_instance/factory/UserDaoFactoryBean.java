package com.haixiaolu.spring_03_bean_instance.factory;

import com.haixiaolu.spring_03_bean_instance.dao.UserDao;
import com.haixiaolu.spring_03_bean_instance.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

public class UserDaoFactoryBean implements FactoryBean<UserDao> {
    // 代替原始实例工厂中创建对象的方法
    @Override
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }

    // 改成非单例的对象

    @Override
    public boolean isSingleton() {
        return false; // true 是单例的
    }
}
