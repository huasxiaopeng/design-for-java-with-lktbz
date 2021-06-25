package com.bridge.simple.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description 支付支付
 * @Author lktbz
 * @Date 2021/06/25
 */
public class PayFingerprintMode  implements IPayMode{

    protected Logger logger = LoggerFactory.getLogger(PayCypher.class);

    public boolean security(String uId) {
        logger.info("指纹支付，风控校验指纹信息");
        return true;
    }
}
