package com.delivery.service;

import com.delivery.entity.User;

import java.util.List;

/**
 * 用户业务接口
 * UserService
 */
public interface UserService {
    
    /**
     * 获取所有用户列表
     * @return 用户列表
     */
    List<User> getUserList();
}
