package com.chain.demo02;

import com.chain.demo01.AuthInfo;
import com.chain.demo01.AuthService;

import java.text.ParseException;
import java.util.Date;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/07/01
 */
public class Level2AuthLink extends AuthLink {

    private Date beginDate = f.parse("2021-07-01 00:00:00");
    private Date endDate = f.parse("2021-07-01 23:59:59");

    public Level2AuthLink(String levelUserId, String levelUserName) throws ParseException, ParseException {
        super(levelUserId, levelUserName);
    }

    @Override
    public AuthInfo doAuth(String uId, String orderId, Date authDate) {
        Date date = AuthService.queryAuthInfo(levelUserId, orderId);
        if (null == date) {
            return new AuthInfo("0001", "单号：", orderId, " 状态：待二级审批负责人 ", levelUserName);
        }
        AuthLink next = super.next();
        if (null == next) {
            return new AuthInfo("0000", "单号：", orderId, " 状态：二级审批完成负责人", " 时间：", f.format(date), " 审批人：", levelUserName);
        }

        if (authDate.before(beginDate) || authDate.after(endDate)) {
            return new AuthInfo("0000", "单号：", orderId, " 状态：二级审批完成负责人", " 时间：", f.format(date), " 审批人：", levelUserName);
        }

        return next.doAuth(uId, orderId, authDate);
    }

}
