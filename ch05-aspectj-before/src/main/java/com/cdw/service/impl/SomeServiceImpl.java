package com.cdw.service.impl;

import com.cdw.service.SomeService;

/**
 * @author: cdw
 * @date: 2021/11/23 19:36
 * @description:
 */
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
        System.out.println("doSome。。。。。。。");
    }

    @Override
    public void doOther() {
        System.out.println("==========doOther===============");
    }
}
