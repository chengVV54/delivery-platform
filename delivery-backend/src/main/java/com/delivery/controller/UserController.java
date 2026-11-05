package com.delivery.controller;

import com.delivery.common.Result;
import com.delivery.entity.User;
import com.delivery.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户接口层
 * UserController
 */
@RestController 
@RequestMapping("/api/users") //统一给这个类的所有接口加前缀
public class UserController {
    
    @Autowired 
    private UserService userService;

    /**
     * 获取所有用户列表
     */
    @GetMapping("/list")
    public Result<List<User>> getUserList(){
        List<User> list = userService.getUserList();
        return Result.success(list);
    }
}
