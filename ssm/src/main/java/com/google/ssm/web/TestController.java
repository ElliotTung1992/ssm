package com.google.ssm.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test")
public class TestController {

    @RequestMapping("returnAAA")
    public String returnAAA(Model model){
        model.addAttribute("name", "Mike");
        return "abc";
    }
}
