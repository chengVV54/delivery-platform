package com.delivery.mapper;

import com.delivery.entity.User;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * 用户数据访问层（目前为假数据模拟数据库）
 * UserMapper
 */
@Repository 
public class UserMapper {
    
    /**
     * 伪造的内存数据库表
     */
    private static final List<User> FAKE_USERS = new ArrayList<>();

    /**
     * 静态代码块：类加载时自动执行一次，塞入两条假数据
     */
    static{
        User user1 = new User();
        user1.setId(1L);
        user1.setUsername("张三");
        user1.setPhone("13800138000");
        user1.setAvatar("https://api.dicebear.com/7.x/avataaars/svg?seed=ZhangSan");
        user1.setCreateTime(LocalDateTime.now());
        FAKE_USERS.add(user1);

        User user2 = new User();
        user2.setId(2L);
        user2.setUsername("李四");
        user2.setPhone("13900139000");
        user2.setAvatar("https://api.dicebear.com/7.x/avataaars/svg?seed=LiSi");
        user2.setCreateTime(LocalDateTime.now().minusDays(1));
        FAKE_USERS.add(user2);
    }

    /**
     * 模拟查询所有用户
     * @return 用户列表
     */
    public List<User> selectAll(){
        return FAKE_USERS;
    }
}
