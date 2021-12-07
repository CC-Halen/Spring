package com.cdw;

import com.cdw.domain.Goods;
import com.cdw.service.GoodsService;
import com.cdw.service.SaleService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author: cdw
 * @date: 2021/11/24 16:39
 * @description:
 */
public class MyTest {
    @Test
    public void test1() {
        String config = "applicationContext.xml";
        ApplicationContext text = new ClassPathXmlApplicationContext(config);

        SaleService saleService = (SaleService) text.getBean("saleService");
        System.out.println(saleService.querySales());
    }

    @Test
    public void test2() {
        String config = "applicationContext.xml";
        ApplicationContext text = new ClassPathXmlApplicationContext(config);

        GoodsService goodsService = (GoodsService) text.getBean("goodsService");
        List<Goods> goods = goodsService.queryGoods();
        goods.forEach(System.out::println);
    }


    @Test
    public void test3() {
        String config = "applicationContext.xml";
        ApplicationContext text = new ClassPathXmlApplicationContext(config);

        GoodsService goodsService = (GoodsService) text.getBean("goodsService");
        Goods goods = goodsService.queryGoodsById(1001);
        System.out.println(goods);
    }

    @Test
    public void test4() {
        String config = "applicationContext.xml";
        ApplicationContext text = new ClassPathXmlApplicationContext(config);

        GoodsService goodsService = (GoodsService) text.getBean("goodsService");
        goodsService.buyGoods(1002,100);


    }

}
