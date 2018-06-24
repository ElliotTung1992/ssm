package com.github.dge1992.ssm.controller;

import com.github.dge1992.ssm.domain.Person;
import org.apache.commons.lang.StringUtils;
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

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "/login";
    }

    @RequestMapping("/login")
    @ResponseBody
    public Object login(HttpServletRequest request, String userName, String password){
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
