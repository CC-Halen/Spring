package com.cdw.handle;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

/**
 * @author: cdw
 *
 * @date: 2021/11/23 19:37
 * @description:
 * @Aspect 切面类的注解
 */
@Aspect
public class MyAspect {
    //定义方法，表示切面的具体功能

    /**
     * @Before 前置通知
     * 属性：value切入点表达式，表示切面的执行位置，在执行这个方法时，会同时执行切面的功能
     * 位置：方法上面
     * 相当于ch04中的proxy
     */
    @Before(value = "execution(void com.cdw.service.impl.SomeServiceImpl.doSome())")
    public void myBefore() {
        System.out.println("前置通知，在目标方法调用之前执行：" + new Date());
    }

    @Before(value = "execution(* *..SomeServiceImpl.doSome())")
    public void myBefore1() {
        System.out.println("前置通知1，在目标方法调用之前执行：" + new Date());
    }

    @Before(value = "execution(* *..service.impl.SomeServiceImpl.do*())")
    public void myBefore2(JoinPoint jp) {
        System.out.println(jp.getSignature());
        System.out.println(jp.getSignature().getName());
        Object[] args = jp.getArgs();
        for(Object arg:args)
            System.out.println(arg);

        System.out.println("前置通知2，在目标方法调用之前执行：" + new Date());
    }


}
