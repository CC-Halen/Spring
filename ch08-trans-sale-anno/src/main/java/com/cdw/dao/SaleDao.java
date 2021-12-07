package com.cdw.dao;

import com.cdw.domain.Sale;

import java.util.List;

/**
 * @author: cdw
 * @date: 2021/11/24 16:04
 * @description:
 */
public interface SaleDao {
    int insertSale(Sale sale);

    List<Sale> selectSales();
}
