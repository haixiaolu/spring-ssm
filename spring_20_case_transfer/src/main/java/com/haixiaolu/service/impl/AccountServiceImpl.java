package com.haixiaolu.service.impl;

import com.haixiaolu.dao.AccountDao;
import com.haixiaolu.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;


    @Override
    @Transactional
    public void transfer(String out, String in, Double money) {
        accountDao.outMoney(out, money);
//        int i = 1/0;
        accountDao.inMoney(in, money);

    }
}
