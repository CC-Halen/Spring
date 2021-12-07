package com.cdw.package3.impl;

import com.cdw.package3.UserDao;
import com.cdw.package3.bean.User;

/**
 * @author: cdw
 * @date: 2021/11/23 15:01
 * @description:
 */
public class OracleUserDaoImpl implements UserDao {
    @Override
    public void insertUser(User user) {
        System.out.println("Oracle insert: "+user);
    }
}
