package com.github.dge1992.ssm.controller;

import com.github.dge1992.ssm.domain.Person;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 登录控制
 */
@Controller
@RequestMapping("/login")
public class LoginController extends BaseController{

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "/login";
    }

    @RequestMapping("/login")
    @ResponseBody
    public Object login(HttpServletRequest request, String userName, String password){
        //日志级别从低到高分为TRACE < DEBUG < INFO < WARN < ERROR < FATAL，如果设置为WARN，则低于WARN的信息都不会输出。
        logger.trace("日志输出 trace");
        logger.debug("日志输出 debug");
        logger.info("日志输出 info");
        logger.warn("日志输出 warn");
        logger.error("日志输出 error");
        if(StringUtils.isNotEmpty(userName) && StringUtils.isNotEmpty(password)){
            Person person = new Person();
            person.setUserName(userName);
            request.getSession().setAttribute("person", person);
            return success("登录成功");
        }else{
            return error("登录失败");
        }
    }
}
