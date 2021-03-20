package com.henjie.dao;

import com.henjie.pojo.Student;

import java.util.List;

/**
 * @Auther: henjie
 * @Date: 2021/1/28 - 01 - 28 - 9:51
 * @Description: com.henjie.dao
 * @version: 1.0
 */
public interface StudentMapper {
    //多对一：查询所有的学生信息，以及对应的老师信息（按照查询嵌套处理）
    public List<Student> getStudent();

    //多对一：查询所有的学生信息，以及对应的老师信息（按照结果嵌套处理）
    public List<Student> getStudent2();

}
