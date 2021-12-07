package com.cdw;

import com.cdw.package1.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.util.Date;

/**
 * @author: cdw
 * @date: 2021/11/23 13:27
 * @description:
 */
public class MyTest1 {


    @Test
    public void test1() {
        String config = "package1/applicationContext.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(config);

        Student student = context.getBean(Student.class);
        System.out.println(student);

        Date mydate = (Date) context.getBean("mydate");
        System.out.println(mydate);
    }


    @Test
    public void test2() {
        String config = "package2/applicationContext.xml";
        ClassPathXmlApplicationContext text = new ClassPathXmlApplicationContext(config);

        com.cdw.package2.Student myStudent = (com.cdw.package2.Student) text.getBean("myStudent");
        System.out.println(myStudent);

    }

    @Test
    public void test3() {
        String config = "package2/applicationContext.xml";
        ClassPathXmlApplicationContext text = new ClassPathXmlApplicationContext(config);

        com.cdw.package2.Student myStudent = (com.cdw.package2.Student) text.getBean("studentByCons");
        System.out.println(myStudent);

    }


    @Test
    public void test4() {
        String config = "package2/applicationContext.xml";
        ClassPathXmlApplicationContext text = new ClassPathXmlApplicationContext(config);

        com.cdw.package2.Student studentByIndex = (com.cdw.package2.Student) text.getBean("studentByIndex");
        System.out.println(studentByIndex);

    }

    @Test
    public void test5() {
        String config = "package2/applicationContext.xml";
        ClassPathXmlApplicationContext text = new ClassPathXmlApplicationContext(config);

        File myFile = (File) text.getBean("myFile");
        System.out.println(myFile.getName());

    }


}
