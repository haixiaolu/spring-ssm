package com.haixiaolu.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class MyAdvice {
    /**
     * 获取参数：
     * 在方法上添加JoinPoint， 通过JoinPoint来获取参数
     */
    @Pointcut("execution(* com.haixiaolu.dao.BookDao.findName(..))")
    public void pt(){}

    @Before("pt()")
    public void before(JoinPoint jp){
        // 为什么是数组呢， 因为参数是不固定的， 可以随时添加， 比如说添加一个password
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("before advice ...");
    }

    @After("pt()")
    public void after(){
        System.out.println("after advice ... ");
    }

    @Around("pt()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable{
        Object[] args = pjp.getArgs();
        System.out.println(Arrays.toString(args));
        args[0] = 666;
        Object ret = pjp.proceed();
        return ret;
    }

    @AfterReturning( value = "pt()", returning = "ret")
    public void afterReturning(Object ret){
        System.out.println("afterReturning advice ..." + ret);
    }

    @AfterThrowing("pt()")
    public void afterThrowing(){
        System.out.println("afterThrowing advice ...");
    }
}
