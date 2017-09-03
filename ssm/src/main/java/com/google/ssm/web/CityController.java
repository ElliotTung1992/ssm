package com.google.ssm.web;

import com.google.ssm.domain.City;
import com.google.ssm.service.CityService;
import com.google.ssm.service.TestService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class CityController {

    @Autowired
    private CityService cityService;

    @Autowired
    private TestService testService;

    @Autowired
    private DataSource dataSource;

    @RequestMapping(value = "/api/city")
    public City findOneCity(@RequestParam(value = "cityName", required = true) String cityName) {
        return cityService.findCityByName(cityName);
    }

    @RequestMapping("jdbc")
    public String jdbc() {
        long start = System.currentTimeMillis();
        testService.jdbc();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        return "success1";
    }

    @RequestMapping("jdbcTemplate")
    public String jdbcTemplate() {
        long start = System.currentTimeMillis();
        testService.jdbcTemplate();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        return "success2";
    }

    @RequestMapping("mybatis")
    public String mybatis() {
        long start = System.currentTimeMillis();
        testService.mybatis();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        return "success";
    }

    @RequestMapping("test1")
    public String test1() {
        long start = System.currentTimeMillis();
        testService.getAllM();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        return "success1";
    }

    @RequestMapping("jdbcInsert")
    public String jdbcInsert() {
        long start = System.currentTimeMillis();
        testService.jdbcInsert();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        return "success333";
    }

    @RequestMapping("mybatisInsert")
    public String mybatisInsert() {
        long start = System.currentTimeMillis();
        testService.mybatisInsert();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        return "success444";
    }

}
