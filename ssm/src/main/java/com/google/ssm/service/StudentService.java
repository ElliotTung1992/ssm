package com.google.ssm.service;

import com.google.ssm.dao.StudentDao;
import com.google.ssm.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    @Transactional
    public List<Student> queryStudentDetail() {
//        List<Student> students = studentDao.queryStudentDetail();
//        List<Student> students1 = studentDao.queryStudentDetail();
//        Student student = new Student();
//        student.setId(1);
//        student.setName("2222");
//        studentDao.updateStudent(student);
//        int i = 7/0;
        List<Student> students = studentDao.selectAll();
        return students;
    }

    public void updateStudent(Student student) {
        studentDao.updateStudent(student);
    }

    public List<Student> queryStudentList() {
        return studentDao.selectAll();
//        return null;
    }
}
