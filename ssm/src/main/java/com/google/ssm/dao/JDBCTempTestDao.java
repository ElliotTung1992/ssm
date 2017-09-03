package com.google.ssm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class JDBCTempTestDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int getAll(){
        return jdbcTemplate.queryForObject("select count(1) from tb_order_detail", Integer.class);
    }
}
