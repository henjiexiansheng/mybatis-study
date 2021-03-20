package com.henjie.dao;

import com.henjie.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {
    //查询全部信息
    @Select("select * from mybatis.user")
    List<User> getUsers();

    //根据Id查询
    //方法如果存在多个参数，则每个参数前均需加@Param("")
    @Select("select * from mybatis.user where id = #{id}")
    User getUserById(@Param("id") int id);

    //增加用户
    @Insert("insert into mybatis.user(id,name,pwd) values (#{id},#{name},#{password})")
    int addUser(User user);

    //修改用户
    @Update("update mybatis.user set name = #{name},pwd = #{password} where id = #{id}")
    int updateUser(User user);

    //删除用户
    @Delete("delete from mybatis.user where id = #{uid}")
    int deleteUser(@Param("uid") int id);
}
