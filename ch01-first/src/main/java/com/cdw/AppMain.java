package com.cdw;

import com.cdw.service.SomeService;
import com.cdw.service.impl.SomeServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: cdw
 * @date: 2021/11/23 11:01
 * @description:
 */
public class AppMain {
    public static void main(String[] args) {
//        SomeService someService = new SomeServiceImpl();
//        someService.doSome();

        //1.指定配置文件
        String config = "beans.xml";
        //2.创建容器对象，bean对象也就创建好了
        ApplicationContext context = new ClassPathXmlApplicationContext(config);
        //3.从容器中获取指定对象
        SomeServiceImpl service = (SomeServiceImpl) context.getBean("someService");
        //4.调用方法
        service.doSome();

    }
}
