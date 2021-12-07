package com.cdw;

import com.cdw.package3.bean.User;
import com.cdw.package3.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: cdw
 * @date: 2021/11/23 14:38
 * @description:
 */
public class MyTest3 {
    @Test
    public void test1(){
        String config = "package3/applicationContext.xml";
        ClassPathXmlApplicationContext text = new ClassPathXmlApplicationContext(config);
        UserServiceImpl userService = (UserServiceImpl) text.getBean("userService");
        userService.addUser(new User(1001,"cdw","cdw@qq.com"));
    }
}
