package com.cdw.handle;

import com.cdw.service3.Student;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * @author: cdw
 * @date: 2021/11/23 19:37
 * @description:
 * @Aspect 切面类的注解
 */
@Aspect
public class MyAspect4 {
    //定义方法，表示切面的具体功能


    /**
     * @param pjp 执行目标方法的，相当于method.invoke()
     * @return 调用目标方法希望返回的值
     * @Around 环绕通知
     */
    @Around(value = "execution(* *..service4.impl.SomeServiceImpl.doFirst(..))")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        if (args != null && args.length > 0) {
            Object arg = args[0];
            if (arg != null)
                System.out.println(arg);
        }

        Object proceed = pjp.proceed();//执行doFirst方法
        System.out.println(proceed);
        System.out.println("执行了环绕通知的方法。。。。");
        return "Hello Around!!!!!!!!!!!";
    }


}
