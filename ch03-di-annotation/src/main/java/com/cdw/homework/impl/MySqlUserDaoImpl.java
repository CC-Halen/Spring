package com.cdw.homework.impl;

import com.cdw.homework.UserDao;
import org.springframework.stereotype.Component;

/**
 * @author: cdw
 * @date: 2021/11/23 17:18
 * @description:
 */
@Component("mysqlUserDaoImpl")
public class MySqlUserDaoImpl implements UserDao {
    @Override
    public void insertUser() {
        System.out.println("MySql insert ...");
    }
}
