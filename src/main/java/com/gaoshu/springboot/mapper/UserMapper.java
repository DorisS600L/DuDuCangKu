package com.gaoshu.springboot.mapper;

import com.gaoshu.springboot.bean.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    //查看用户
    @Select("select u.*,d.dname from tuser u,dept d where u.deptno=d.deptno")
    public List<User> selectUserList();
}
