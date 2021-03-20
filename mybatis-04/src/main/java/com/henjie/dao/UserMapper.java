package com.henjie.dao;

import com.henjie.pojo.User;

import java.util.List;

public interface UserMapper {
    //根据ID查询
    User getUserById(int id);
}
