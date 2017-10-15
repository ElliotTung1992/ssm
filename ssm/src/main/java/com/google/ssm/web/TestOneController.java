package com.google.ssm.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("testOne")
public class TestOneController {

    @RequestMapping("test1")
    public Map<String, Object> test1(){
        Map<String, Object> map = new HashMap<>();
        map.put("id", 1);
        map.put("name", "dong");
        map.put("date", new Date());
        return map;
    }

}
