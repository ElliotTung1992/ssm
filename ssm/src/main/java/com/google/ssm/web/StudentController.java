package com.google.ssm.web;

import com.github.pagehelper.PageHelper;
import com.google.ssm.domain.Student;
import com.google.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/queryStudentDetail")
    public Object queryStudentDetail(){
        PageHelper.startPage(1, 10);
        long start = System.currentTimeMillis();
        List<Student> students = studentService.queryStudentDetail();
        long end = System.currentTimeMillis();
        System.out.println(end -start);
        //students.stream().forEach(t -> System.out.println(t));
        return students;
    }

    @RequestMapping("/updateStudent")
    public String updateStudent(){
        Student student = new Student();
        student.setId(1);
        student.setName("周杰伦");
        studentService.updateStudent(student);
        return "success";
    }

    @RequestMapping("queryStudentList")
    public Object queryStudentList(){
        List<Student> students = studentService.queryStudentList();
        return students;
    }
}
