package com.google.ssm.dao;

import com.google.ssm.domain.Student;
import com.google.ssm.util.MyMapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface StudentDao extends MyMapper<Student>{


    List<Student> queryStudentDetail();

    void updateStudent(Student student);
}
