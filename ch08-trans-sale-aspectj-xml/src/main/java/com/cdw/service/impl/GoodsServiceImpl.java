package com.cdw.service.impl;

import com.cdw.dao.GoodsDao;
import com.cdw.dao.SaleDao;
import com.cdw.domain.Goods;
import com.cdw.domain.Sale;
import com.cdw.exception.NotEnoughException;
import com.cdw.service.GoodsService;

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
