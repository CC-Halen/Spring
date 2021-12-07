package com.cdw;

import com.cdw.service.SomeService;
import com.cdw.service.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: cdw
 * @date: 2021/11/23 12:30
 * @description:
 */
public class MyTest {
    String config = "beans.xml";
    ApplicationContext context = new ClassPathXmlApplicationContext(config);

    @Test
    public void test1(){

        SomeService service = context.getBean(SomeService.class);
        service.doSome();

    }

    @Test
    public void test2(){
        int count = context.getBeanDefinitionCount();
        System.out.println(count);
        String[] names = context.getBeanDefinitionNames();
        for (String name:names)
            System.out.println(name);
    }
}
