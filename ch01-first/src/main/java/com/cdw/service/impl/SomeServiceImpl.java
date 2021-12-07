package com.cdw.service.impl;

import com.cdw.service.SomeService;

/**
 * @author: cdw
 * @date: 2021/11/23 10:55
 * @description:
 */
public class SomeServiceImpl implements SomeService {

    public SomeServiceImpl() {
        System.out.println("impl的无参构造器。。。。");
    }

    public SomeServiceImpl(String name) {
        System.out.println("impl的有参构造器。。。。");
    }

    @Override
    public void doSome() {
        System.out.println("业务方法start！！！！");
    }
}
