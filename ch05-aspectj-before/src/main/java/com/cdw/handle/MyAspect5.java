package com.cdw.handle;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * @author: cdw
 * @date: 2021/11/23 19:37
 * @description:
 * @Aspect 切面类的注解
 */
@Aspect
public class MyAspect5 {
    //定义方法，表示切面的具体功能

    /**
     * @AfterThrowing:异常通知 属性： value 切入点表达式
     * throwing 自定义变量，表示目标方法抛出的异常。
     * 变量名必须和通知方法的形参名一样
     * 位置：在方法的上面
     * 特点：
     * 1. 在目标方法抛出异常后执行的， 没有异常不执行
     * 2. 能获取到目标方法的异常信息。
     * 3. 不是异常处理程序。可以得到发生异常的通知， 可以发送邮件，短信通知开发人员。
     * 看做是目标方法的监控程序。
     * <p>
     * 异常通知的执行
     * try{
     * SomeServiceImpl.doSecond(..)
     * }catch(Exceptoin e){
     * myAfterThrowing(e);
     * }
     */
    @AfterThrowing(value = "execution(* *..service5.impl.SomeServiceImpl.doSecond(..))", throwing = "e")
    public void myAfterThrowing(Exception e) {
        System.out.println("目标方法抛出异常时执行，reason：" + e.getMessage());
    }

}
