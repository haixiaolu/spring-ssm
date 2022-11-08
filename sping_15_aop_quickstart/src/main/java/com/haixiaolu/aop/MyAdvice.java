package com.haixiaolu.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {

    // 4. 切入点
    @Pointcut("execution(void com.haixiaolu.dao.BookDao.update())")
    private void pt(){}

    @Before("pt()")
    // 3步， 制作共性功能
    public void method(){
        System.out.println(System.currentTimeMillis());
    }
}
