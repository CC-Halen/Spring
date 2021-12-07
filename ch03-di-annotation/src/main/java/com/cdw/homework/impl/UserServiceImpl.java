package com.cdw.homework.impl;

import com.cdw.homework.UserDao;
import com.cdw.homework.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author: cdw
 * @date: 2021/11/23 17:20
 * @description:
 */
@Service("userServiceImpl")
public class UserServiceImpl implements UserService {
    @Autowired
    @Qualifier("mysqlUserDaoImpl")
    private UserDao userDao;

    @Override
    public void addUser() {
        userDao.insertUser();
    }
}
