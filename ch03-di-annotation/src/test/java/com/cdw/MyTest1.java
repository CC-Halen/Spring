package com.cdw;

import com.cdw.package1.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: cdw
 * @date: 2021/11/23 14:54
 * @description:
 */
public class MyTest1 {

    @Test
    public void test1() {
        String config = "applicationContext.xml";
        ApplicationContext text = new ClassPathXmlApplicationContext(config);
        Student student = (Student) text.getBean("myStudent");
        System.out.println(student);
    }

    @Test
    public void test2() {
        String config = "applicationContext.xml";
        ApplicationContext text = new ClassPathXmlApplicationContext(config);
        Student student = (Student) text.getBean("student");
        System.out.println(student);
    }
}
