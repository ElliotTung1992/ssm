package com.google.ssm.tset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestDatabase {

    //使用jdbc
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://192.168.0.234:3306/moveinsp?useUnicode=true&characterEncoding=utf8";
    private static final String user = "root";
    private static final String pwd ="123456";


    public static void main(String[] args) {
        String sql = "select id, user_id AS userId, order_id AS orderId, work_area_id AS workAreaId, `status`, is_pass AS isPass, cut_off_time AS cutOffTime, create_time AS createTime, update_time AS updateTime, is_del AS isDel  from tb_order_detail";
        try {

            long startCon = System.currentTimeMillis();
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url, user, pwd);
            final long endCon = System.currentTimeMillis();

            long startSql = System.currentTimeMillis();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            long endSql = System.currentTimeMillis();

            System.out.println(endCon - startCon);
            System.out.println(endSql - startSql);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
