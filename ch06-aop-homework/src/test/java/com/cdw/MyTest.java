package com.cdw;

import com.cdw.service.NumberService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: cdw
 * @date: 2021/11/23 22:03
 * @description:
 */
public class MyTest {
    @Test
    public void test1() {
        Integer a = -5;
        System.out.println(a);
    }

    @Test
    public void test2() {
        String config = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        NumberService service = (NumberService) context.getBean("numberService");
        System.out.println(service.addNumber(1,1,90));


    }
}
