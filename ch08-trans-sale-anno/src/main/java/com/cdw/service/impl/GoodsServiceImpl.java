package com.cdw.service.impl;

import com.cdw.dao.GoodsDao;
import com.cdw.dao.SaleDao;
import com.cdw.domain.Goods;
import com.cdw.domain.Sale;
import com.cdw.exception.NotEnoughException;
import com.cdw.service.GoodsService;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: cdw
 * @date: 2021/11/24 16:30
 * @description:
 */
public class GoodsServiceImpl implements GoodsService {
    private GoodsDao goodsDao;
    private SaleDao saleDao;

    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }

    /*
    设置方式一：
    @Transactional(propagation = Propagation.REQUIRED,
            isolation = Isolation.DEFAULT,
            readOnly = false, timeout = 20,
            rollbackFor = {NullPointerException.class,NotEnoughException.class})*/

    /*
    设置方式二：
    @Transactional(propagation = Propagation.REQUIRED,
            isolation = Isolation.DEFAULT,
            readOnly = false, timeout = 20)
     rollbackFor的使用：
        1.先判断方法抛出的异常是否在rollbackFor的数组中，如果在，则一定回滚
        2.若不在，则继续判断是否是RuntimeException的异常，如果是，则回滚
            */

    //设置方式三：默认值
    @Transactional
    @Override
    public void buyGoods(Integer id, Integer amount) {

        /**
         * 生成销售记录，放在校验之后就不用事务的出错回滚，放在校验之前则需要加上事务管理
         */
        Sale sale = new Sale();
        sale.setGid(id);
        sale.setNum(amount);
        saleDao.insertSale(sale);

        //先校验
        Goods goods = goodsDao.selectGoodsById(id);
        if (goods == null) {
            throw new NullPointerException(id + "商品不存在");
        } else if (goods.getAmount() < amount) {
            throw new NotEnoughException("库存不足");
        }

        //更新库存
        goods.setId(id);
        goods.setAmount(amount);
        goodsDao.updateGoods(goods);

    }

    @Override
    public Goods queryGoodsById(Integer id) {
        return goodsDao.selectGoodsById(id);
    }

    @Override
    public List<Goods> queryGoods() {
        return goodsDao.selectGoods();
    }
}
