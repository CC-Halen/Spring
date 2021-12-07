package com.cdw.service;

import com.cdw.domain.Goods;

import java.util.List;

/**
 * @author: cdw
 * @date: 2021/11/24 16:27
 * @description:
 */
public interface GoodsService {
    void buyGoods(Integer id, Integer amount);

    Goods queryGoodsById(Integer id);

    List<Goods> queryGoods();
}
