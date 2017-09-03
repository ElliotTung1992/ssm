package com.google.ssm.domain;

import java.io.Serializable;

public class Student implements Serializable{

    private Integer id;
    private String name;
    private Integer age;

//    private Class clazz;
//    private List<Teacher> teachers;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

//    public Class getClazz() {
//        return clazz;
//    }
//
//    public void setClazz(Class clazz) {
//        this.clazz = clazz;
//    }
//
//    public List<Teacher> getTeachers() {
//        return teachers;
//    }
//
//    public void setTeachers(List<Teacher> teachers) {
//        this.teachers = teachers;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
