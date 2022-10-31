package com.haixiaolu.spring_03_bean_instance.dao;

import com.haixiaolu.spring_03_bean_instance.factory.OrderDaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceOrder {
    public static void main(String[] args) {
        // 通过静态工厂创建对象 -- 早先年
//        OrderDao orderDao = OrderDaoFactory.getOrderDao();
//        orderDao.save();

        // 通过spring获取
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        OrderDao orderDao = (OrderDao) ctx.getBean("OrderDao");
        orderDao.save();
    }
}
