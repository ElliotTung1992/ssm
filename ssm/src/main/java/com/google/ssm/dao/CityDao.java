package com.google.ssm.dao;

import com.google.ssm.domain.City;
import com.google.ssm.domain.OrderDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 城市 DAO 接口类
 *
 * Created by bysocket on 07/02/2017.
 */
public interface CityDao {

    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName 城市名
     */
    City findByName(@Param("cityName") String cityName);

    List<OrderDetail> getAllM();

    void mybatisInsert();
}
