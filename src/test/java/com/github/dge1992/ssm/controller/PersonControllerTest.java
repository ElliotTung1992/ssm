package com.github.dge1992.ssm.controller;

import com.github.dge1992.ssm.domain.Person;
import net.minidev.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonControllerTest {

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext wac;

    @Before
    public void setup(){
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    public void queryPersonListTest() throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("id", "1");
        map.put("userName", "dong");
        map.put("age", "12");
        map.put("sex", "1");
        map.put("address", "宁波");

        //创建一个get请求
        RequestBuilder req = get("/person/queryPersonById?id=1");
        MvcResult result = mockMvc.perform(req).andExpect(status().isOk()).andExpect(content().string(JSONObject.toJSONString(map)))
                .andReturn();
        System.out.println(result.getResponse().getContentAsString());
    }
}

