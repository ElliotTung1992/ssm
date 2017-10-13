package com.google.ssm.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("testOne")
public class TestOneController {

    @RequestMapping("test1")
    public Map<String, String> test1(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("id", "1");
        map.put("name", "dong");
        return map;
    }

}
