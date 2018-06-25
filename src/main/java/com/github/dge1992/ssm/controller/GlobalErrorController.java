package com.github.dge1992.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局错误页面控制器
 */
@RequestMapping("/globalError")
@Controller
public class GlobalErrorController {

    /**
     * 测试跳转到动态500错误页面
     * @return
     */
    @RequestMapping("/testError")
    @ResponseBody
    public Object testError(){
        int i = 10 / 0;
        return "error";
    }

    /**
     * 自定义错误跳转
     * @return
     */
    @RequestMapping("/test500")
    @ResponseBody
    public Object test500(){
        return "服务器内部错误";
    }

    /**
     * 局部异常处理类
     * @param e
     * @return
     */
    /*@ExceptionHandler(Exception.class)
    @ResponseBody
    public Object exHandler(Exception e){
        if(e instanceof ArithmeticException){
            return "发生了除0异常";
        }
        return "发生了未定义异常";
    }*/
}
