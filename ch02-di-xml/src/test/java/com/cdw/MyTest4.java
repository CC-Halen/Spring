package com.cdw;

import com.cdw.package4.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: cdw
 * @date: 2021/11/23 15:22
 * @description:
 */
public class MyTest4 {


    @Test
    public void test1() {
        String config = "package4/applicationContext.xml";
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
