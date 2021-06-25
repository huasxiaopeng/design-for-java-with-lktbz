package com.bridge.simple.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description 密码支付校验
 * @Author lktbz
 * @Date 2021/06/25
 */
public class PayCypher implements IPayMode{

    protected Logger logger = LoggerFactory.getLogger(PayCypher.class);

    public boolean security(String uId) {
        logger.info("密码支付，风控校验环境安全");
        return true;
    }
}
