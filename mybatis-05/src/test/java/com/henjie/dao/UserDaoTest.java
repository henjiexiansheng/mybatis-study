package com.henjie.dao;

import com.henjie.pojo.User;
import com.henjie.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoTest {

    static Logger logger = Logger.getLogger(UserDaoTest.class);

    //测试根据用户id查询信息。
    @Test
    public void getUserById(){
        //固定语句
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        logger.info("测试，进入getUserById方法成功");

        UserMapper Mapper = sqlSession.getMapper(UserMapper.class);
        User userById = Mapper.getUserById(1);
//        System.out.println(userById);
        logger.info(userById);
        //固定语句
        sqlSession.close();
    }

    //测试分页实现查询
        @Test
        public void getUserByLimit(){
            SqlSession sqlSession = MybatisUtils.getSqlSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("startIndex",0);
            map.put("pageSize",2);
            List<User> userList = mapper.getUserByLimit(map);
            for (User user : userList) {
                System.out.println(user);
            }
            sqlSession.close();
        }
}
