package com.google.ssm.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("test")
public class TestController {

    @RequestMapping("returnAAA")
    public String returnAAA(Model model){
        model.addAttribute("name", "Mike");
        return "abc";
    }

    @RequestMapping("returnTest1")
    public String returnTest1(){
        return "test1";
    }

    @RequestMapping("aaa")
    @ResponseBody
    public Object aaa(){
        int a = 0;
        return "";
    }
}
