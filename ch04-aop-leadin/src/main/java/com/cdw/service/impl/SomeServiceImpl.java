package com.cdw.service.impl;

import com.cdw.service.SomeService;

/**
 * @author: cdw
 * @date: 2021/11/23 17:41
 * @description:
 */
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
        System.out.println("业务逻辑111111111111111111");
    }

    @Override
    public void doOther() {
        System.out.println("业务逻辑2222222222222222222");
    }
}
