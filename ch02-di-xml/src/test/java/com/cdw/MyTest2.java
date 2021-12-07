package com.cdw;

import com.cdw.package2.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.util.Date;

/**
 * @author: cdw
 * @date: 2021/11/23 13:27
 * @description:
 */
public class MyTest2 {


    @Test
    public void test1() {
        String config = "package2/applicationContext.xml";
        ClassPathXmlApplicationContext text = new ClassPathXmlApplicationContext(config);

        Student bean = (Student) text.getBean("myStudent");
        System.out.println(bean);

    }

    @Test
    public void test2() {
        String config = "package2/applicationContext.xml";
        ClassPathXmlApplicationContext text = new ClassPathXmlApplicationContext(config);

        Student bean = (Student) text.getBean("studentByName");
        System.out.println(bean);

    }

    @Test
    public void test3() {
        String config = "package2/applicationContext.xml";
        ClassPathXmlApplicationContext text = new ClassPathXmlApplicationContext(config);

        Student bean = (Student) text.getBean("studentByType");
        System.out.println(bean);

    }


}
