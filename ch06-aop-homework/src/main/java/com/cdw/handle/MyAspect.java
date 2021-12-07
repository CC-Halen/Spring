package com.cdw.handle;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author: cdw
 * @date: 2021/11/23 21:46
 * @description:
 */
public class MyAspect {
    @Before("myPt()")
    public void myBefore() {
        System.out.println("开始校验并执行，执行结果是：");
    }

    @Around("myPt()")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        int a = 10/0;
        Object[] args = pjp.getArgs();
        Object methodReturn;
        if (args != null && args.length == 3) {
            for (Object arg :
                    args) {
                if (arg == null) {
                    methodReturn = -1;
                }
            }
            for (Object arg : args) {
                Integer num = (Integer) arg;
                if (num < 0)
                    methodReturn = -1;
            }
            methodReturn = pjp.proceed();
        }
        methodReturn = "输入有误";
        return methodReturn;
    }

    @Pointcut("execution(* com.cdw.service.impl.NumberServiceImpl.addNumber(..))")
    private void myPt() {
    }
}
