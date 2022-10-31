package com.haixiaolu.spring_03_bean_instance.dao;

import com.haixiaolu.spring_03_bean_instance.factory.UserDaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceUser {
    public static void main(String[] args) {

        // 旧方法
        // 创建实例工厂对象
//        UserDaoFactory userDaoFactory = new UserDaoFactory();
//        // 通过实例工厂对象创建对象
//        UserDao userDao = userDaoFactory.getUserDao();
//        userDao.save();

        // 新方法
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        UserDao userDao = (UserDao) ctx.getBean("UserDao");
        userDao.save();
    }
}
