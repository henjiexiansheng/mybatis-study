package com.henjie.dao;

import com.henjie.pojo.User;

import java.util.List;
import java.util.Map;

public interface Mapper {
    //查询全部用户信息
    List<User> getUserList();

    //根据ID查询
    User getUserById(int id);

    //插入一个用户
    int addUser(User user);

    //修改用户信息
    int updateUser(User user);

    //删除用户
    int deleteUser(int id);
}
