package com.bridge.simple.model;

/**
 * @Description 支付方式校验
 * @Author lktbz
 * @Date 2021/06/25
 */
public interface IPayMode {
    /**
     * uid 校验支付方式
      * @param uId
     * @return
     */
    public boolean security(String uId);
}
