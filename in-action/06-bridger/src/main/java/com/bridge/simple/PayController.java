package com.bridge.simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * @Description  传统实现方式
 * @Author lktbz
 * @Date 2021/06/25
 */
public class PayController {

    private Logger logger = LoggerFactory.getLogger(PayController.class);

    /**
     * 从优化的角度来说这段代码有很大的问题，首先，支付公司，支付宝微信是否可以在抽出来一层，
     * 支付方式：密码，人脸，指纹，抽象看是相似的是否可以在进行抽象
     * @param uId
     * @param tradeId
     * @param amount
     * @param channelType
     * @param modeType
     * @return
     */
    public  boolean doPay(String uId, String tradeId, BigDecimal amount, int channelType, int modeType){
        // 微信支付
        if (1 == channelType) {
            logger.info("模拟微信渠道支付划账开始。uId：{} tradeId：{} amount：{}", uId, tradeId, amount);
            if (1 == modeType) {
                logger.info("密码支付，风控校验环境安全");
            } else if (2 == modeType) {
                logger.info("人脸支付，风控校验脸部识别");
            } else if (3 == modeType) {
                logger.info("指纹支付，风控校验指纹信息");
            }
        }
        // 支付宝支付
        else if (2 == channelType) {
            logger.info("模拟支付宝渠道支付划账开始。uId：{} tradeId：{} amount：{}", uId, tradeId, amount);
            if (1 == modeType) {
                logger.info("密码支付，风控校验环境安全");
            } else if (2 == modeType) {
                logger.info("人脸支付，风控校验脸部识别");
            } else if (3 == modeType) {
                logger.info("指纹支付，风控校验指纹信息");
            }
        }
        return true;
    }
}
