package com.github.dge1992.ssm.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局的的异常拦截器
 */
@ControllerAdvice
public class BusinessExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Object jwtException(Exception e) {
        if(e instanceof ArithmeticException){
            return "发生了除0异常";
        }
        return "发生了未定义异常";
    }
}
