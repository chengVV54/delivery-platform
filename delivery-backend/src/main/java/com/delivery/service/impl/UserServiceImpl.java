package com.delivery.service.impl;

import com.delivery.entity.User;
import com.delivery.mapper.UserMapper;
import com.delivery.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户业务实现类
 * UserServiceImpl
 */
@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserMapper userMapper;

    @Override 
    public List<User> getUserList(){
        // 目前直接调用 Mapper 获取假数据
        // 以后业务复杂了，可以在这里加脱敏、权限校验等逻辑
        return userMapper.selectAll();
    }
}
