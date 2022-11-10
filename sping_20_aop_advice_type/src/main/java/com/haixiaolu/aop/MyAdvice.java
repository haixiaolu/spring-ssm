package com.haixiaolu.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 创建通知类
 */
@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(void com.haixiaolu.dao.BookDao.update())")
    private void pt(){}

    @Before("pt()")
    public void before(){
        System.out.println("before advice...");
    }

   @After("pt()")
    public void after(){
        System.out.println("after advice ...");
    }

    @Around("pt()")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before advice ...");
        pjp.proceed();
        System.out.println("around after advice ...");
    }

    @AfterReturning("pt()")
    public void afterReturning(){
        System.out.println("afterReturning advice ...");
    }

    @AfterThrowing("pt()")
    public void afterThrowing(){
        System.out.println("afterThrowing advice ...");
    }
}
