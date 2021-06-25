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
    /**
     * 抽象提取分析：
     *   public  boolean doPay(String uId, String tradeId, BigDecimal amount, int channelType, int modeType){
     *   uId tradeId amount 为必要条件，支付参数
     *
     *    int channelType, int modeType 当进行抽象时，这两个判断条件基本不需要了
     *    支付宝和微信 抽取出一个支付的方法
     *
     *   密码支付  人脸支付 指纹支付 这三种就是支付校验密码是否符合，然后做扣款操作，需要在支付操作里进行调用
     *    密码支付  人脸支付 指纹支付 抽取出一个支付校验的操作。
     *
     *    下面是伪代码：
     *     interface payMode{
     *       //是否可以进行付款
     *       boolean isSercurity(String uid);
     *     }
     *     //密码
     *    class PayCypher ims payMode{
     *        boolean  isSercurity(String uid){
     *            业务操作
     *            return true;
     *        }
     *    }
     *  //人脸
     *  class PayFaceMode ims payMode{
     *      *        boolean  isSercurity(String uid){
     *      *            业务操作
     *      *            return true;
     *      *        }
     *      *    }
     *  //指纹
     *  class PayFinger ims payMode{
     *      *        boolean  isSercurity(String uid){
     *      *            业务操作
     *      *            return true;
     *      *        }
     *      *    }
     *
     *  //支付伪代码
     *  abs class pay{
     *      payMode paymode;
     *      pay(payMode paymode){}
     *      dopay(uId tradeId amount){
     *         boolean bs= paymode.isSercurity(uid)
     *          判断是否需要进行下一步操作
     *          支付成功or失败
     *      }
     *  }
     *
     */
}
