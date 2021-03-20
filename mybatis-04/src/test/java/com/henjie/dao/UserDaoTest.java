package com.henjie.dao;

import com.henjie.pojo.User;
import com.henjie.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @Auther: henjie
 * @Date: 2021/1/25 - 01 - 25 - 16:41
 * @Description: com.henjie.dao
 * @version: 1.0
 */
public class UserDaoTest {
    //测试根据用户id查询信息。
    @Test
    public void getUserById(){
        //固定语句
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper Mapper = sqlSession.getMapper(UserMapper.class);
        User userById = Mapper.getUserById(1);
        System.out.println(userById);

        //固定语句
        sqlSession.close();
    }
}
