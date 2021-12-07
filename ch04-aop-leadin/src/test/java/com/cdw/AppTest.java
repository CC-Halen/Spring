package com.cdw;

import static org.junit.Assert.assertTrue;

import com.cdw.proxy.ServiceProxy;
import com.cdw.service.SomeService;
import com.cdw.service.impl.SomeServiceImpl;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        SomeService service = new SomeServiceImpl();
        service.doSome();
        System.out.println("********************************");
        service.doOther();
    }

    @Test
    public void test1() {
        SomeService service = new ServiceProxy();
        service.doSome();
        System.out.println("********************************");
        service.doOther();
    }
}
