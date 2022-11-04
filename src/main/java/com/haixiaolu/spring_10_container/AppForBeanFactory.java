package com.haixiaolu.spring_10_container;

import com.haixiaolu.spring_10_container.dao.BookDao;
import org.apache.naming.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class AppForBeanFactory {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("container.xml");
//        BeanFactory bf = new XmlBeanFactory(resource);
//        BookDao bookDao = bf.getBean(BookDao.class);

    }
}




