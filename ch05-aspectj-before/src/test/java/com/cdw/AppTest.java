package com.cdw;

import static org.junit.Assert.assertTrue;

import com.cdw.service.SomeService;
import com.cdw.service.impl.SomeServiceImpl;
import com.cdw.service3.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest {


    @Test
    public void test1() {
        String config = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        SomeService someService = (SomeService) context.getBean("someService");
        someService.doSome();

        someService.doOther();

    }

    @Test
    public void test2() {
        String config = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        com.cdw.service2.SomeService someService = (com.cdw.service2.SomeService) context.getBean("someService2");
        String res = someService.doOther("cdw", 11);

    }

    @Test
    public void test3() {
        String config = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        com.cdw.service3.SomeService someService = (com.cdw.service3.SomeService) context.getBean("someService3");
        Student student = someService.doOther("cdw", 11);
        System.out.println(student);

    }

    @Test
    public void test4() {
        String config = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        com.cdw.service4.SomeService someService = (com.cdw.service4.SomeService) context.getBean("someService4");
        //执行的并不是doFirst方法体，而是环绕通知中的方法，要执行的话就只有在环绕通知中进行proceed方法
        String s = someService.doFirst("cdw", 11);
        System.out.println(s);

    }

    @Test
    public void test5() {
        String config = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        com.cdw.service5.SomeService someService = (com.cdw.service5.SomeService) context.getBean("someService5");
        someService.doSecond("cdw");

    }


    @Test
    public void test6() {
        String config = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        com.cdw.service6.SomeService someService = (com.cdw.service6.SomeService) context.getBean("someService6");
        someService.doLast();

    }


    @Test
    public void test7() {
        String config = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        com.cdw.service7.SomeService someService = (com.cdw.service7.SomeService) context.getBean("someService7");
        someService.doLast();

    }


}
