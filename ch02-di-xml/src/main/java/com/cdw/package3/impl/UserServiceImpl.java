package com.cdw.package3.impl;

import com.cdw.package3.UserDao;
import com.cdw.package3.bean.User;
import com.cdw.package3.bean.UserService;

/**
 * @author: cdw
 * @date: 2021/11/23 14:34
 * @description:
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserServiceImpl() {
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser(User user) {
        userDao.insertUser(user);
    }
}
