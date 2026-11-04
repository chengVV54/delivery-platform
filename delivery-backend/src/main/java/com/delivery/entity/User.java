package com.delivery.entity;

import lombok.Data;
import java.time.LocalDateTime;

/**
 * 用户实体类（外卖平台的用户）
 * User
 */
@Data 
public class User {
    /** 用户ID */
    private Long id;

    /** 用户名 */
    private String username;

    /** 手机号 */
    private String phone;

    /** 头像地址 */
    private String avatar;

    /** 注册时间 */
    private LocalDateTime createTime;
}
