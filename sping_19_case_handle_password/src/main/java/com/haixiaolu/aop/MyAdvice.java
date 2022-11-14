package com.haixiaolu.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(boolean com.haixiaolu.service.*Service.*(*,*))")
    private void servicePt(){}

    // 环绕通知
    @Around("MyAdvice.servicePt()")
    public Object trimStr(ProceedingJoinPoint pjp) throws Throwable {
        // 获取原始方法的参数
        Object[] args = pjp.getArgs();
        for (int i = 0; i < args.length; i++) {
            // 判断参数是不是字符串
            if (args[i].getClass().equals(String.class)){
                args[i] = args[i].toString().trim();
            }
        }
        // 将修改后的参数传入到原始方法的执行中
        Object ret = pjp.proceed();
        return ret;
    }
}
