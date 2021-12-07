package com.cdw.handle;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

/**
 * @author: cdw
 * @date: 2021/11/23 19:37
 * @description:
 * @Aspect 切面类的注解
 */
@Aspect
public class MyAspect6 {
    //定义方法，表示切面的具体功能

    /**
     * @After：最终通知
     *    属性： value 切入点表达式
     *    位置： 在方法的上面
     * 特点：
     *  1. 在目标方法之后执行的。
     *  2. 总是会被执行。
     *  3. 可以用来做程序最后的收尾工作。例如清除临时数据，变量。 清理内存
     *
     *  最终通知
     *  try{
     *      SomeServiceImpl.doThird(..)
     *  }finally{
     *      myAfter()
     *  }
     */
    @After(value = "execution(* *..service6.impl.SomeServiceImpl.doLast())")
    public void myAfter() {
        System.out.println("Always do............");
    }
}
