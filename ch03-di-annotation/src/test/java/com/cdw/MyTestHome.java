package com.cdw;

import com.cdw.homework.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: cdw
 * @date: 2021/11/23 17:22
 * @description:
 */
public class MyTestHome {
    @Test
    public void test1(){
        String config = "applicationContext.xml";
        ApplicationContext text = new ClassPathXmlApplicationContext(config);
        UserServiceImpl userServiceImpl = (UserServiceImpl) text.getBean("userServiceImpl");
        userServiceImpl.addUser();
    }
}
