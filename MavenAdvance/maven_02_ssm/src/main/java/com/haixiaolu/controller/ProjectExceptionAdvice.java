package com.haixiaolu.controller;

import com.haixiaolu.exception.BusinessException;
import com.haixiaolu.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {

    // 处理系统异常
    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException ex){
        // 记录日志
        // 发送消息给运维
        // 发送邮件给开发人员
        return new Result(ex.getCode(), null, ex.getMessage());

    }

    // 处理业务异常
    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException ex){
        return new Result(ex.getCode(), null, ex.getMessage());

    }

    @ExceptionHandler(Exception.class)
    public Result doOtherException(Exception ex){
        return new Result(Code.SYSTEM_UNKNOWN_ERROR, null, "系统繁忙， 请稍后再试！");

    }
}
