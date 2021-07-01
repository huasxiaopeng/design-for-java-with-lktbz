package com.chain.demo01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description 一堆代码实现
 * @Author lktbz
 * @Date 2021/07/01
 */
public class AuthController {

    private SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 审批大杂烩
     * @param uId
     * @param orderId
     * @param authDate
     * @return
     * @throws ParseException
     */
    public AuthInfo doAuth(String uId, String orderId, Date authDate) throws ParseException {
        /**
         * 三级审批
         */
        Date date = AuthService.queryAuthInfo("1000013", orderId);
        if(null==date){
            return new AuthInfo("0001","单号",orderId,"状态：待三级审批负责人 ","王工");
        }
        /**
         * 二级审批
         */
        if(authDate.after(f.parse("2021-07-01 00:00:00"))&& authDate.before(f.parse("2021-07-20 23:59:59"))){
            date = AuthService.queryAuthInfo("1000012", orderId);
            if(null==date){
                return new AuthInfo("0001","单号",orderId," 状态：待二级审批负责人 ", "张经理");

            }
        }
        /**
         * 一级审批
         */
        if(authDate.after(f.parse("2021-07-01 00:00:00"))&& authDate.before(f.parse("2021-07-20 23:59:59"))){
            date = AuthService.queryAuthInfo("1000011", orderId);
            if(null==date){
                return new AuthInfo("0001","单号",orderId," 状态：待一级审批负责人 ", "段总");

            }
        }
        return new AuthInfo("0001", "单号：", orderId, " 状态：审批完成");
    }
}
