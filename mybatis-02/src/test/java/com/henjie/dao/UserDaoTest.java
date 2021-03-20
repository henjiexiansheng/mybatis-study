package com.henjie.dao;

import com.henjie.pojo.User;
import com.henjie.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: henjie
 * @Date: 2021/1/25 - 01 - 25 - 16:41
 * @Description: com.henjie.dao
 * @version: 1.0
 */
public class UserDaoTest {
    //测试查询所有用户信息
    @Test
    public void Test(){
        //第一步：获得sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //第二步：执行SQL（方式一 getMapper）
        Mapper mapper = sqlSession.getMapper(Mapper.class);
        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        //第三步：关闭sqlSession
        sqlSession.close();
    }

    //测试根据用户id查询信息。
    @Test
    public void getUserById(){
        //固定语句
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        Mapper mapper = sqlSession.getMapper(Mapper.class);
        User userById = mapper.getUserById(1);
        System.out.println(userById);

        //固定语句
        sqlSession.close();
    }

    //模糊查询
    @Test
    public void getUserLike(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        Mapper mapper = sqlSession.getMapper(Mapper.class);
        List<User> list = mapper.getUserLike("憨");
        for (User user : list) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    //插入一个用户
    //注意：增删改需要提交事务
    @Test
    public void addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        Mapper mapper = sqlSession.getMapper(Mapper.class);
        int i = mapper.addUser(new User(4, "马头", "123456"));
        if(i>0){
            System.out.println("插入成功");
        }
        //提交事务（增删改必需要提交事务，否则不成功）
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    //插入一个用户,应用map
    public void addUser2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        Mapper mapper = sqlSession.getMapper(Mapper.class);
        Map map = new HashMap<String, Object>();
        map.put("aaa",5);
        map.put("bbb","王宇航");
        map.put("ccc","123456");
        mapper.addUser2(map);
        sqlSession.commit();
        sqlSession.close();
    }

    //修改用户
    @Test
    public void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        Mapper mapper = sqlSession.getMapper(Mapper.class);
        mapper.updateUser(new User(4,"高洁","123456"));
        //注意提交事务。
        sqlSession.commit();
        sqlSession.close();
    }

    //删除用户信息
    @Test
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        Mapper mapper = sqlSession.getMapper(Mapper.class);
        mapper.deleteUser(4);
        sqlSession.commit();    //注意增删改必须提交事务。
        sqlSession.close();
    }
}
