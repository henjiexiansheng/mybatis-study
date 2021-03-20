package com.henjie.dao;

import com.henjie.pojo.User;

import java.util.List;
import java.util.Map;

public interface Mapper {
    //查询全部用户信息
    List<User> getUserList();

    //根据ID查询
    User getUserById(int id);

    //模糊查询
    List<User> getUserLike(String value);

    //插入一个用户
    int addUser(User user);

    //插入一个用户，应用map（不需要管user有什么）
    int addUser2(Map<String,Object> map);

    //修改用户信息
    int updateUser(User user);

    //删除用户
    int deleteUser(int id);
}
