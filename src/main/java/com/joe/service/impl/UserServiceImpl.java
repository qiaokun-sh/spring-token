package com.joe.service.impl;

import com.joe.entity.User;
import com.joe.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @author:joe
 * @date:2019/5/20 19:44
 */
@Service
public class UserServiceImpl implements IUserService {

    @Override
    public boolean checkUser(String loginName, String password) {

        return true;
    }

    @Override
    public User getUserByLoginName(String loginName) {
        User user = new User();
        user.setId("2019");
        user.setName("joe");
        user.setAge(18);
        return user;
    }
}
