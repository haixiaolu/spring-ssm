package com.haixiaolu;

import com.haixiaolu.config.SpringConfig;
import com.haixiaolu.domain.Account;
import com.haixiaolu.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = ctx.getBean(AccountService.class);
        Account ac = accountService.findById(2);
        System.out.println(ac);
    }
}
