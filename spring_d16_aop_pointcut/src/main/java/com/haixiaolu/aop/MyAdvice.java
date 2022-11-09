package com.haixiaolu.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    // @Pointcut("execution(* com.haixiaolu.dao.impl.BookDaoImpl.update())")
    // @Pointcut("execution(* com.*.*.*.update())")
    // @Pointcut("execution(* *..*(..))")
    @Pointcut("execution(* *..*(..))") // 以e结尾匹配
    private void pt(){}

    @Before("pt()")
    public void method(){
        System.out.println(System.currentTimeMillis());
    }
}
