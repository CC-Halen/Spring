package com.cdw.service.impl;

import com.cdw.service.NumberService;
import org.springframework.stereotype.Service;

/**
 * @author: cdw
 * @date: 2021/11/23 21:45
 * @description:
 */
@Service("numberService")
public class NumberServiceImpl implements NumberService {
    @Override
    public Integer addNumber(Integer n1, Integer n2, Integer n3) {
        return n1 + n2 + n3;
    }
}
