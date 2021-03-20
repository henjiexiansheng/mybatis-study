package com.henjie.dao;

import com.henjie.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @Auther: henjie
 * @Date: 2021/1/28 - 01 - 28 - 9:57
 * @Description: com.henjie.dao
 * @version: 1.0
 */
public interface TeacherMapper {

    Teacher getTeacher(@Param("tid") int id);
}
