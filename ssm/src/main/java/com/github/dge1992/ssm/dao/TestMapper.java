package com.github.dge1992.ssm.dao;

import com.github.dge1992.ssm.domain.Cat;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TestMapper {

    List<Cat> queayCat();

    void insertCat(@Param("cat") Cat cat);
}
