package com.gaoshu.springboot.service.impl;

import com.gaoshu.springboot.bean.User;
import com.gaoshu.springboot.mapper.UserMapper2;
import com.gaoshu.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class UserServiceImpl  implements UserService {
    @Autowired
    private UserMapper2 userMapper2;
    @Cacheable("selectUserList")  //在缓存中开辟了selectUserList区域，存储用户列表
    public List<User> selectUserList(){
        System.out.println("验证缓存");
        return userMapper2.selectAll();
    }
}
