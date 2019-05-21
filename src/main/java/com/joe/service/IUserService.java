package com.joe.service;

import com.joe.entity.User;

/**
 * @author:joe
 * @date:2019/5/20 19:43
 */
public interface IUserService {
    boolean checkUser(String loginName, String password);

    User getUserByLoginName(String loginName);
}
