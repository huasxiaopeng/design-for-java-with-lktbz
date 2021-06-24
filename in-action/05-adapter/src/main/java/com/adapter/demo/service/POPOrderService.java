package com.adapter.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description 第三方下单数量
 * @Author lktbz
 * @Date 2021/06/24
 */
public class POPOrderService {
    private Logger logger = LoggerFactory.getLogger(POPOrderService.class);

    public boolean isFirstOrder(String uId) {
        logger.info("POP商家，查询用户的订单是否为首单：{}", uId);
        return true;
    }
}
