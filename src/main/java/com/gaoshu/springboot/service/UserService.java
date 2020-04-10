package com.gaoshu.springboot.service;

import com.gaoshu.springboot.bean.User;
import java.util.List;

public interface UserService {
    //查看用户
    public List<User> selectUserList();
}
