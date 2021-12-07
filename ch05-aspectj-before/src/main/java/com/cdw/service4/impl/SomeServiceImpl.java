package com.cdw.service4.impl;

import com.cdw.service4.SomeService;
import com.cdw.service4.Student;

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
    public Student doOther(String name, Integer age) {
        System.out.println("==========doOther===============");
        return new Student(name, age);
    }

    @Override
    public String doFirst(String name, Integer age) {
        System.out.println("============doFirst===========");
        return "doFirst";
    }
}
