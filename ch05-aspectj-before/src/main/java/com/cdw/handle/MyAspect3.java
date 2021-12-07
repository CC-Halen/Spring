package com.cdw.handle;

import com.cdw.service3.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

/**
 * @author: cdw
 * @date: 2021/11/23 19:37
 * @description:
 * @Aspect 切面类的注解
 */
@Aspect
public class MyAspect3 {
    //定义方法，表示切面的具体功能

    /**
     * @AfterReturning 后置通知
     * 用res接收doOther的调用结果
     */
    @AfterReturning(value = "execution(* *..service3.impl.SomeServiceImpl.doOther(..))", returning = "res")
    public void myAfterReturning(Object res) {
        System.out.println("后置通知，在方法执行之后进行，拿到的结果是：" + res);
        if (res instanceof Student) {
            Student student = (Student) res;
            student.setName("赵四");
            student.setAge(11);
        }
    }


}
