package com.cdw.package3.impl;

import com.cdw.package3.UserDao;
import com.cdw.package3.bean.User;

/**
 * @author: cdw
 * @date: 2021/11/23 14:31
 * @description:
 */
public class MySqlUserDaoImpl implements UserDao {
    @Override
    public void insertUser(User user) {
        System.out.println("MySql插入用户：" + user);
    }
}
