package com.cdw.service.impl;

import com.cdw.dao.SaleDao;
import com.cdw.domain.Sale;
import com.cdw.service.SaleService;

import java.util.List;

/**
 * @author: cdw
 * @date: 2021/11/24 16:26
 * @description:
 */
public class SaleServiceImpl implements SaleService {
    private SaleDao saleDao;

    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }


    @Override
    public List<Sale> querySales() {
        return saleDao.selectSales();
    }
}
