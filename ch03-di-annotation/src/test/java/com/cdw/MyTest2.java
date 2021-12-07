package com.cdw;

import com.cdw.package3.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: cdw
 * @date: 2021/11/23 16:44
 * @description:
 */
public class MyTest2 {

    @Test
    public void test1() {
        String config = "applicationContext.xml";
        ApplicationContext text = new ClassPathXmlApplicationContext(config);
        Student student = (Student) text.getBean("student3");
        System.out.println(student);
    }

}
