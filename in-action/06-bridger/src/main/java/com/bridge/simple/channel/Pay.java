package com.bridge.simple.channel;

import com.bridge.simple.model.IPayMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * @Description 支付抽象类
 * @Author lktbz
 * @Date 2021/06/25
 */
public abstract class Pay {
    protected Logger logger = LoggerFactory.getLogger(Pay.class);
    /**
     * 支付方式，密码：人脸
     */
    protected IPayMode payMode;

    public Pay(IPayMode payMode) {
        this.payMode = payMode;
    }

    /**
     * 支付
     * @param uId
     * @param tradeId
     * @param amount
     * @return
     */
    public abstract String transfer(String uId, String tradeId, BigDecimal amount);

}
