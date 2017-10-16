package com.google.ssm.web;

import com.alibaba.fastjson.JSON;
import com.google.ssm.domain.Group;
import com.google.ssm.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("test")
public class TestController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("writelog")
    @ResponseBody
    public Object writeLog()
    {
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
        return "OK";
    }

    @RequestMapping("returnAAA")
    public String returnAAA(Model model) {
        model.addAttribute("name", "Mike");
        return "abc";
    }

    @RequestMapping("returnTest1")
    public String returnTest1() {
        return "test1";
    }

    @RequestMapping("aaa")
    @ResponseBody
    public Object aaa(String username, String content) {
        Group group = new Group();
        group.setId(0L);
        group.setName("admin");

        User guestUser = new User();
        guestUser.setId(2L);
        guestUser.setName("guest");

        User rootUser = new User();
        rootUser.setId(3L);
        rootUser.setName("root");

        group.addUser(guestUser);
        group.addUser(rootUser);

        String jsonString = JSON.toJSONString(group);
        Group group1 = JSON.parseObject(jsonString, Group.class);

        System.out.println(jsonString);
        return jsonString;
    }
}
