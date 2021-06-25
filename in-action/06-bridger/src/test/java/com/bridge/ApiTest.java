package com.bridge;

import com.bridge.simple.channel.AliPay;
import com.bridge.simple.channel.Pay;
import com.bridge.simple.channel.WxPay;
import com.bridge.simple.model.PayFaceMode;
import com.bridge.simple.model.PayFingerprintMode;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/06/25
 */
public class ApiTest {
    @Test
    public void test_pay() {

        System.out.println("\r\n模拟测试场景；微信支付、人脸方式。");
        Pay wxPay = new WxPay(new PayFaceMode());
        wxPay.transfer("weixin_1092033111", "100000109893", new BigDecimal(100));

        System.out.println("\r\n模拟测试场景；支付宝支付、指纹方式。");
        Pay zfbPay = new AliPay(new PayFingerprintMode());
        zfbPay.transfer("jlu19dlxo111","100000109894",new BigDecimal(100));

    }
}
