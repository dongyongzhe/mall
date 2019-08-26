package com.luckincoffee.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: dyz
 * @Date: 2019/8/26 13:32
 * @Description: 外键约束异常处理
 */
@RestController
@ControllerAdvice
public class GloabalExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public String defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        e.printStackTrace();
        Class contraintViolationException = Class.forName("org.hibernate.exception.ConstraintViolationException");
        if(null!=e.getCause() && contraintViolationException==e.getCause().getClass()) {
            return "违反了约束，多半是外键约束";
        }
        return e.getMessage();
    }
}

