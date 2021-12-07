package com.cdw.handle;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author: cdw
 * @date: 2021/11/23 19:37
 * @description:
 * @Aspect 切面类的注解
 */
@Aspect
public class MyAspect7 {
    //定义方法，表示切面的具体功能

    @Before(value = "myPt()")
    public void myBefore() {
        System.out.println("Always do before ............");
    }


    @After(value = "myPt()")
    public void myAfter() {
        System.out.println("Always do last ............");
    }

    /**
     * @Pointcut: 定义和管理切入点，不是通知注解。
     *     属性： value 切入点表达式
     *     位置： 在一个自定义方法的上面， 这个方法看做是切入点表达式的别名。
     *           其他的通知注解中，可以使用方法名称，就表示使用这个切入点表达式了
     */
    @Pointcut(value = "execution(* *..service7.impl.SomeServiceImpl.doLast())")
    public void myPt(){

    }
}
