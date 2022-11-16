package com.haixiaolu.service.impl;

import com.haixiaolu.dao.AccountDao;
import com.haixiaolu.service.AccountService;
import com.haixiaolu.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Autowired
    private LogService logService;

    @Transactional
    @Override
    public void transfer(String out, String in, Double money) {
        try {
            accountDao.outMoney(out, money);
            accountDao.inMoney(in, money);
        } finally {
            logService.log(out, in, money);
        }
    }
}
