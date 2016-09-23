package com.spon.login.service.impl;

import com.spon.login.dao.UserMapper;
import com.spon.login.service.IUserService;
import com.spon.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by myg on 2016/9/23.
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> listUsers() {
        return userMapper.listUsers();
    }
}
