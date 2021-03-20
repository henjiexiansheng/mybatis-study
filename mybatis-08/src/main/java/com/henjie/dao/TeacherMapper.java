package com.henjie.dao;

import com.henjie.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Auther: henjie
 * @Date: 2021/1/28 - 01 - 28 - 9:57
 * @Description: com.henjie.dao
 * @version: 1.0
 */
public interface TeacherMapper {
    //获取所有老师
    public List<Teacher> getTeacher();

    //获取指定老师下的所有学生及老师的信息。
    public Teacher getTeacherById(@Param("tid") int id);
}
