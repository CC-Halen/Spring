package com.cdw.handle;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

/**
 * @author: cdw
 * @date: 2021/11/23 19:37
 * @description:
 * @Aspect 切面类的注解
 */
@Aspect
public class MyAspect2 {
    //定义方法，表示切面的具体功能

    /**
     * @AfterReturning 后置通知
     * 用res接收doOther的调用结果
     */
    @AfterReturning(value = "execution(* *..service2.impl.SomeServiceImpl.doOther(..))", returning = "res")
    public void myAfterReturning(JoinPoint jp, Object res) {
        System.out.println(jp.getSignature());
        System.out.println("后置通知，在方法执行之后进行，拿到的结果是：" + res);
    }


}
