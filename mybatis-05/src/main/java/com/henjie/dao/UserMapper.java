package com.henjie.dao;

import com.henjie.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //根据ID查询
    User getUserById(int id);

    //分页查询
    List<User> getUserByLimit(Map<String,Object> map);
}
