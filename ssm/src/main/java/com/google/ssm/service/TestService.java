package com.google.ssm.service;

import com.google.ssm.dao.CityDao;
import com.google.ssm.domain.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class TestService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private CityDao cityDao;

//    public void getAll(){
//        String sql = "select * from tb_order_detail";
//        //jdbcTemplate.queryForList(sql);
//        getConnection();
//        try {
//            ps=con.prepareStatement(sql);
//            rs=ps.executeQuery();
//        } catch (SQLException e) {
//
//            e.printStackTrace();
//        }
//
//    }


    public void getAllM() {
        List<OrderDetail> allM = cityDao.getAllM();
        System.out.println(allM.size());
    }


//    private Connection con = null;
//
//    private PreparedStatement ps = null;
//    public ResultSet rs=null;
//
//    public void getConnection(){
//        try {
//            Class.forName(Driver);
//            con= DriverManager.getConnection(URL,User,pwd);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }











    //使用jdbc
    private final String Driver = "com.mysql.jdbc.Driver";
    //private final String URL = "jdbc:mysql://192.168.0.234:3306/moveinsp?useUnicode=true&characterEncoding=utf8";
    private final String URL = "jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=utf8";
    private final String User = "root";
    private final String pwd ="admin";

    public void jdbc(){
        try {
            List<OrderDetail> orderDetails = new ArrayList<>();
            Class.forName(Driver);
            Connection connection = DriverManager.getConnection(URL, User, pwd);
            String sql = "select id, user_id AS userId, order_id AS orderId, work_area_id AS workAreaId, `status`, is_pass AS isPass, cut_off_time AS cutOffTime, create_time AS createTime, update_time AS updateTime, is_del AS isDel  from tb_order_detail";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                int userId = resultSet.getInt("userId");
                int orderId = resultSet.getInt("orderId");
                int workAreaId = resultSet.getInt("workAreaId");
                int status = resultSet.getInt("status");
                int isPass = resultSet.getInt("isPass");
                int isDel = resultSet.getInt("isDel");
                Date cutOffTime = resultSet.getDate("cutOffTime");
                Date createTime = resultSet.getDate("createTime");
                Date updateTime = resultSet.getDate("updateTime");

                OrderDetail orderDetail = new OrderDetail(id, userId, orderId, workAreaId, status, isPass, cutOffTime, createTime, updateTime, isDel);
                orderDetails.add(orderDetail);
            }
            if(resultSet!=null){
                resultSet.close();//关闭ResultSet
            }
            if(preparedStatement!=null){
                preparedStatement.close();//关闭Statement
            }
            if(connection!=null){
                connection.close();//关闭Connection
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //jdbcTemplate
    public void jdbcTemplate(){
        String sql = "select *  from tb_order_detail";
        List<OrderDetail> orderDetails = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(OrderDetail.class));
    }

    //mybatis
    public void mybatis(){
        List<OrderDetail> allM = cityDao.getAllM();
    }

    //jdbc
    public void jdbcInsert(){
        try{
            Class.forName(Driver);
            Connection connection = DriverManager.getConnection(URL, User, pwd);
            long start = System.currentTimeMillis();
            for (int i = 0; i < 100000; i++){
                //String sql = "INSERT INTO moveinsp.tb_trajectory (id, uuid, user_id, longitude, latitude, created_time, update_time, is_del) VALUES ("+ (1 +i )+", NULL, '6', '121.5493', '29.8212', '2017-05-19 14:38:38', '2017-05-19 14:38:38', '0')";
                String sql = "INSERT INTO test.student (id, name, age) VALUES ('" + (2 + i) + "', '周杰伦', '11')";
                Statement statement = connection.createStatement();
                statement.executeUpdate(sql);
            }
            long end = System.currentTimeMillis();
            System.out.println(end - start);
        }catch (Exception e){

        }
    }

    public void mybatisInsert() {
        for (int i = 0; i < 100000; i++){
            cityDao.mybatisInsert();
        }
    }
}
