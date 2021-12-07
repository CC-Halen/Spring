package com.cdw.proxy;

import com.cdw.service.SomeService;
import com.cdw.service.impl.SomeServiceImpl;

/**
 * @author: cdw
 * @date: 2021/11/23 17:52
 * @description:
 */
public class ServiceProxy implements SomeService {
    SomeService service = new SomeServiceImpl();
    @Override
    public void doSome() {
        System.out.println("增加的业务逻辑。。。。。。。。。。。。。。。。。。");
        service.doSome();
        System.out.println("------------------------------------");
    }

    @Override
    public void doOther() {
        System.out.println("增加的业务逻辑==========================");
        service.doOther();
        System.out.println("---------------------------------------");
    }
}
