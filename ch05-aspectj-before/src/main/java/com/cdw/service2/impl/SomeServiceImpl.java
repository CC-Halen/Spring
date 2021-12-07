package com.cdw.service2.impl;

import com.cdw.service2.SomeService;
import org.aspectj.lang.annotation.AfterReturning;

/**
 * @author: cdw
 * @date: 2021/11/23 19:36
 * @description:
 */
public class SomeServiceImpl implements SomeService {


    @Override
    public void doSome(String name, Integer age) {
        System.out.println("doSome。。。。。。。");
    }

    @Override
    public String doOther(String name, Integer age) {
        System.out.println("==========doOther===============");
        return "yes";
    }
}
