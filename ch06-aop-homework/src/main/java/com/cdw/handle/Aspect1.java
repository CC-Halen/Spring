package com.cdw.handle;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author: cdw
 * @date: 2021/11/23 22:26
 * @description:
 */
@Aspect
@Component
public class Aspect1 {
    @Before("myPt1()")
    public void myBefore() {
        System.out.println("开始校验并执行，执行结果是：");
    }

    @Around("myPt1()")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        if (args != null && args.length == 3) {
            for (Object arg :
                    args) {
                if (arg == null) {
                    return -1;
                }
            }
            for (Object arg : args) {
                Integer num = (Integer) arg;
                if (num < 0)
                    return  -2;
            }
            return pjp.proceed();
        }
         return -3;
    }

    @Pointcut("execution(* com.cdw.service.impl.NumberServiceImpl.addNumber(..))")
    private void myPt1() {
    }
}
