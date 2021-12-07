package com.cdw.dao;

import com.cdw.domain.Goods;

import java.util.List;

/**
 * @author: cdw
 * @date: 2021/11/24 16:06
 * @description:
 */
public interface GoodsDao {
    int updateGoods(Goods goods);

    List<Goods> selectGoods();

    Goods selectGoodsById(Integer id);
}
