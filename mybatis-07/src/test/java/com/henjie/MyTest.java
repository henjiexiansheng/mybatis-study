package com.henjie;

import com.henjie.dao.StudentMapper;
import com.henjie.dao.TeacherMapper;
import com.henjie.pojo.Student;
import com.henjie.pojo.Teacher;
import com.henjie.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Auther: henjie
 * @Date: 2021/1/28 - 01 - 28 - 10:08
 * @Description: com.henjie
 * @version: 1.0
 */
public class MyTest {
    @Test
    public void getTeacher(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        sqlSession.close();
    }

    @Test
    public void getStudent(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student = mapper.getStudent();
        for (Student i : student) {
            System.out.println(i);
        }
        sqlSession.close();
    }

    @Test
    public void getStudent2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student = mapper.getStudent2();
        for (Student i : student) {
            System.out.println(i);
        }
        sqlSession.close();
    }
}
