package com.albedo.bigevent.mapper;

import com.albedo.bigevent.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserMapper {
    /**
     * 根据用户名查询用户
     * @param username
     * @return
     */
    @Select("select * from user where username=#{username}")
    User findByUserName(String username);

    /**
     * 注册
     * @param username
     * @param password
     */
    @Insert("insert into user(username,password,create_time,update_time)" +
            " values(#{username},#{password},now(),now())")
    void add(String username, String password);

    /**
     * 更新用户详细信息
     * @param user
     */
    @Update("update user set nickname=#{nickname},email=#{email},update_time=#{updateTime} where id =#{id}")
    void update(User user);
}
