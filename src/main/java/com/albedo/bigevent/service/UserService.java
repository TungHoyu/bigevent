package com.albedo.bigevent.service;

import com.albedo.bigevent.pojo.User;

public interface UserService {
    /**
     * 根据用户名查询
     * @param username
     * @return
     */
    User findByUserName(String username);

    /**
     * 注册用户
     * @param username
     * @param password
     */
    void register(String username, String password);

    /**
     * 更新用户信息
     * @param user
     */
    void update(User user);
}
